package cn.itcast.Utils.Impl;

import cn.itcast.Entity.News;

import cn.itcast.Utils.Util;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class UtilImpl extends HibernateDaoSupport implements Util {
    /*
 在HibernateDaoSupport里有这个函数，在applicationContext.xml文件里对InfoDao注入了sessionFactory
 注入之后就自动生成了hibernateTemplate，故下面save函数可以直接使用
 *  public final void setSessionFactory(SessionFactory sessionFactory) {
     if (this.hibernateTemplate == null || sessionFactory != this.hibernateTemplate.getSessionFactory()) {
         this.hibernateTemplate = this.createHibernateTemplate(sessionFactory);
     }
 }
 * */
   @Autowired
    public void setSF(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);

    }

    @Override
    public Map FindAll(Class c, int page, int limit) {
       Map m = new HashMap();

        DetachedCriteria criteria=DetachedCriteria.forClass(c);
        //查询总记录数  (分页要求必须有总行数)
        Long totalCount = (Long) criteria.setProjection(Projections.rowCount()).getExecutableCriteria(Objects.requireNonNull(this.getHibernateTemplate().getSessionFactory()).getCurrentSession()).uniqueResult();
        m.put("count",totalCount);
                //取消查询行数 (不能省略)
            criteria.setProjection(null);
            //查询结果放入map 中
       List<?> list = this.getHibernateTemplate().findByCriteria(criteria, page, limit);
        m.put("data",list);
        return m;
   }

    @Override
    public Object FindById(Class c,Integer id) {
        logger.debug("FindById");
        return this.getHibernateTemplate().get(c,id);
    }

    @Override
    public Map FindLike(Class c, String str,int page, int limit) {
        Map m = new HashMap();
        DetachedCriteria criteria=DetachedCriteria.forClass(c);
        /*
                //模糊查询总行数
             MatchMode.EXACT 精确匹配，相当于 like 'value'
             MatchMode.ANYWHERE 字符串在中间位置，相当于 like '%value%'
             MatchMode.START 字符串在最前面的位置，相当于“like 'value%'
             MatchMode.END 字符串在最后面的位置，相当于“like '%value'
        * */
        criteria.add(Restrictions.ilike("newTitle", str,MatchMode.ANYWHERE));
        Long totalCount = (Long) criteria.setProjection(Projections.rowCount()).getExecutableCriteria(Objects.requireNonNull(this.getHibernateTemplate().getSessionFactory()).getCurrentSession()).uniqueResult();
        m.put("count",totalCount);
            //如上
        criteria.setProjection(null);
        //模糊查询并放入map中
        criteria.add(Restrictions.ilike("newTitle", str,MatchMode.ANYWHERE));
        List<?> list = this.getHibernateTemplate().findByCriteria(criteria, page, limit);


        m.put("data",list);
        return m;
    }


    @Override
//不用多说
    public boolean SaveOrUpdate(Object obj) {

      try {
           this.getHibernateTemplate().saveOrUpdate(obj);

          logger.debug("SaveOrUpdate");
           return true;
       }catch (Exception o){
           logger.debug(o);
           return false;
       }

    }

    @Override
    public boolean DeleteByID(Object obj) {
//        try {
            this.getHibernateTemplate().delete(obj);
            logger.debug("DeleteByID");
            return true;
//        }catch (Exception o){
//            logger.debug(o);
//            return false;
//        }
    }
}

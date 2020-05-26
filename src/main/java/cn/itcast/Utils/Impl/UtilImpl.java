package cn.itcast.Utils.Impl;

import cn.itcast.Entity.News;

import cn.itcast.Utils.Util;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;

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
    public List<Object> FindAll(String hql) {
        return this.getHibernateTemplate().findByExample(new News());
    }

    @Override
    public Object FindById(Class c,Integer id) {
        logger.debug("FindById");
        return this.getHibernateTemplate().get(c,id);
    }


    @Override

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
        try {
            this.getHibernateTemplate().delete(obj);
            logger.debug("DeleteByID");
            return true;
        }catch (Exception o){
            logger.debug(o);
            return false;
        }
    }
}

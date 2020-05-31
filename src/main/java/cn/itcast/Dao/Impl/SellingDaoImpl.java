package cn.itcast.Dao.Impl;

import cn.itcast.Dao.ISellingDao;
import cn.itcast.Entity.Selling;
import cn.itcast.Utils.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class SellingDaoImpl extends HibernateDaoSupport implements ISellingDao {

    @Autowired
    private Util util;

    @Autowired
    public void setHT(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public boolean addSelling(Selling selling) {
        return util.SaveOrUpdate(selling);
    }

    @Override
    public boolean updateSelling(Selling selling) {
        return util.SaveOrUpdate(selling);
    }

    @Override
    public boolean deleteSelling(Selling selling) {
        return util.DeleteByID(selling);
    }

    @Override
    public Map findAll(Selling selling, int currentPage, int pageRow) {

        return util.FindAll(selling.getClass(),currentPage,pageRow);

    }


    @Override
    public boolean updateInventory(int number,String invName) {
        Session sf=this.getSessionFactory().getCurrentSession();
        Transaction t=sf.beginTransaction();
        System.out.println(number+".........................updateInventory.............................."+invName);
        try{
            sf.createSQLQuery("update inventory set ItyNumber=ItyNumber-? where ItyName=?").setParameter(1,number).setParameter(2,invName);
            t.commit();
            return true;
        }catch(Exception e){
            System.out.println("修改失败");
            t.rollback();
            sf.close();
            return false;
        }
    }

    @Override
    public Map FindLike(Class c, String str, int page, int limit) {
        return util.FindLike(c,str,page,limit);
    }


}

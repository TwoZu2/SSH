package cn.itcast.Dao.Impl;

import cn.itcast.Dao.DepartDao;
import cn.itcast.Entity.Department;
import cn.itcast.Utils.HibernateUtils;
import cn.itcast.Utils.Util;


import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartDaoImpl implements DepartDao {
    @Autowired
    Util util;
    @Autowired
    HibernateUtils hibernateUtils;

    @Override
    public List<Department> selectDepartment(String name, int page, int no) {
        if(name!=null){
            Query query=hibernateUtils.getSession().createQuery("from Department where  depName like ? limit ?,?");
            query.setParameter(0,name);
            query.setParameter(1,page);
            query.setParameter(2,no);
            List<Department> lists = query.list();
            return lists;
        }else{
            Query query=hibernateUtils.getSession().createQuery("from Department where  depName limit ?,?");
            query.setParameter(0,page);
            query.setParameter(1,no);
            return query.list();
        }
    }



    @Override
    public boolean saveDepartment(Department department) {
        return util.SaveOrUpdate(department);
    }

    @Override
    public boolean deleteDepartment(Department department) {
        return util.DeleteByID(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return util.SaveOrUpdate(department);
    }
}

package cn.itcast.Service.Impl;

import cn.itcast.Dao.DepartDao;
import cn.itcast.Entity.Department;
import cn.itcast.Service.DepartService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.regex.Matcher;

public class DepartServiceImpl implements DepartService {

    @Autowired
    DepartDao departDao;

    @Override
    public int selectcont(String name) throws SQLException {

        String hql = "select count(*) from User as user";
       // Integer count = (Integer)getHibernateTemplate().find(hql).listIterator().next();
       // return count.intValue();

        return 1;


    }


    @Override
    public String selectAll(String name, int page, int no) throws SQLException, JSONException {
        return null;
    }

    @Override
    public boolean add(Department department) throws SQLException {
        return departDao.saveDepartment(department);
    }

    @Override
    public boolean delete(Department department) throws SQLException {
        return departDao.deleteDepartment(department);
    }

    @Override
    public boolean update(Department department) throws SQLException {
        return departDao.updateDepartment(department);
    }
}

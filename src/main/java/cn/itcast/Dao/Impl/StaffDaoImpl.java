package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IStaffDao;
import cn.itcast.Entity.Department;
import cn.itcast.Entity.Employees;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

//String中的bean管理 注解
@Repository

public class StaffDaoImpl implements IStaffDao {
    @Autowired
    Util util;


    @Override
    public Map findAll(Class z, int page, int no) {
        return util.FindAll(z,page,no);
    }

    @Override
    public Map findLike(Class c, Map map, int page, int limit) {
        return util.FindLike(c,map,page,limit);
    }

    @Override
    public boolean save(Employees employees) {
        return util.SaveOrUpdate(employees);
    }

    @Override
    public boolean updateById(Employees employees) {
        return util.SaveOrUpdate(employees);
    }

    @Override
    public boolean deleteById(Employees employees) {
        return util.DeleteByID(employees);
    }

}

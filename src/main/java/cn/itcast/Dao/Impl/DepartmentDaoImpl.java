package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IDepartmentDao;
import cn.itcast.Entity.Department;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Map;

//String中的bean管理 注解
@Repository
public class DepartmentDaoImpl implements IDepartmentDao {
    @Autowired
    Util util;



    @Override
    public Map findAll(Class z, int page, int no) {
        return util.FindAll(z,page,no);
    }

    @Override
    public Map findLike(Class c, String str, int page, int limit) {
        return util.FindLike(c,str,page,limit);
    }

    @Override
    public boolean save(Department department) {
        return util.SaveOrUpdate(department);
    }

    @Override
    public boolean updateById(Department department) {
        return util.SaveOrUpdate(department);
    }

    @Override
    public boolean deleteById(Department department) {
        return util.DeleteByID(department);
    }
}

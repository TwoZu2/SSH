package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IAdminDao;
import cn.itcast.Entity.Administrator;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class AdminDaoImpl implements IAdminDao {
    @Autowired
    Util util;
    @Override
    public boolean save(Administrator administrator) {

        return util.SaveOrUpdate(administrator);
    }
    @Override
    public boolean UpdateById(Administrator administrator) {

        return util.SaveOrUpdate(administrator);
    }

    @Override
    public Map FindAll(Administrator administrator, int page, int limit) {

        return util.FindAll(administrator.getClass(),page,limit);
    }

}

package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IServiceDao;
import cn.itcast.Entity.Service;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ServiceDaoImpl implements IServiceDao{

    @Autowired
    Util util;

    @Override
    public Map FindAll(Class z, int page, int no) {
        return util.FindAll(z,page,no);
    }

    @Override
    public Map FindLike(Class c, Map<String,String> map, int page, int limit) {
        return util.FindLike(c, map,page,limit);
    }

    @Override
    public boolean save(Service service) {
        return util.SaveOrUpdate(service);
    }

    @Override
    public boolean UpdateById(Service service) {return util.SaveOrUpdate(service); }

    @Override
    public boolean DeleteById(Service service) {
        return util.DeleteByID(service);
    }
}

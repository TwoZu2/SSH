package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IAppoDao;
import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Contactus;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class AppoDaoImpl implements IAppoDao {
    @Autowired
    Util util;

    public Map findAll(Class z, int page, int limit) {
        return util.FindAll(z,page,limit);
    }


    public boolean UpdateById(Appointment appointment) {

        return util.SaveOrUpdate(appointment);
    }


    public boolean DeleteById(Appointment appointment) {
        return util.DeleteByID(appointment);
    }

    public Map FindLike(Class c, Map map, int page, int limit) {

        return util.FindLike(c,map,page,limit);
    }
}

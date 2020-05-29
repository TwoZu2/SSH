package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IRepDao;
import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Repairs;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class RepDao implements IRepDao {
    @Autowired
    Util util;

    public Map findAll(Class z, int page, int limit) {
        return util.FindAll(z,page,limit);
    }


    public boolean UpdateById(Repairs repairs) {
        if(repairs.getRepId()!=0){
            Repairs repairs1 = (Repairs) util.FindById(repairs.getClass(),repairs.getRepId());
            repairs1.setRepPrice(repairs.getRepPrice());
            repairs1.setRepState(repairs.getRepState());
            repairs1.setCarTime(repairs.getCarTime());
            return true;
        }


        return util.SaveOrUpdate(repairs);
    }


    public boolean DeleteById(Repairs repairs) {
        return util.DeleteByID(repairs);
    }

    public Map FindLike(Class c, Map map, int page, int limit) {

        return util.FindLike(c,map,page,limit);
    }
}

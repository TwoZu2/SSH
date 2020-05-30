package cn.itcast.Dao;

import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Contactus;

import java.util.Map;

public interface IAppoDao {
    Map findAll(Class z, int page, int limit);
    Map FindLike(Class c,Map map,int page, int limit);
    boolean UpdateById(Appointment appointment);
    boolean DeleteById(Appointment appointment);
}

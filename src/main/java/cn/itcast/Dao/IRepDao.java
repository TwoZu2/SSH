package cn.itcast.Dao;

import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Repairs;

import java.util.Map;

public interface IRepDao {
    Map findAll(Class z, int page, int limit);
    Map FindLike(Class c,Map map,int page, int limit);
    boolean UpdateById(Repairs repairs);
    boolean DeleteById(Repairs repairs);
}

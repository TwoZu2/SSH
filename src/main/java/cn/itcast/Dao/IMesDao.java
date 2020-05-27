package cn.itcast.Dao;

import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.Message;

import java.util.Map;

public interface IMesDao {
    Map findAll(Class z,int page,int limit);
    Map FindLike(Class c,Map map,int page, int limit);
    boolean UpdateById(Contactus message);
    boolean DeleteById(Contactus message);
}

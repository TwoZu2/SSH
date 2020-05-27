package cn.itcast.Dao;

import cn.itcast.Entity.Service;

import java.util.Map;

public interface IServiceDao {
    public Map FindAll(Class z, int page, int no);
    public Map FindLike(Class c,String str,int page, int limit);
    public boolean save(Service service);
    public boolean UpdateById(Service service);
    public boolean DeleteById(Service service);
}

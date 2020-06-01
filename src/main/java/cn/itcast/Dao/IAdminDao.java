package cn.itcast.Dao;

import cn.itcast.Entity.Administrator;

import java.util.Map;

public interface IAdminDao {
    public boolean save(Administrator administrator);
    public boolean UpdateById(Administrator administrator);
    public Map FindAll(Administrator administrator, int page, int limit);
}

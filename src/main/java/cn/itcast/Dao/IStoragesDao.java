package cn.itcast.Dao;

import cn.itcast.Entity.Storages;

import java.util.Map;

public interface IStoragesDao {
    public boolean addStorages(Storages storages);
    public boolean deleteStorages(Storages storages);
    public boolean updateStorages(Storages storages);
    public Map findAllStorages(Storages storages, int currentPage, int pageRow);
    public Map FindLike(Class c, String str, int page, int limit);
}

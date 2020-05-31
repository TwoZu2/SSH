package cn.itcast.Service;

import cn.itcast.Entity.Storages;

import java.util.Map;

public interface IStoragesService {
    public boolean addStorages(Storages storages);
    public boolean deleteStorages(Storages storages);
    public boolean updateStorages(Storages storages);
    public Map findAllStorages(Storages storages, int currentPage, int pageRow);
    public Map findLikeInventory(Storages storages, int currentPage, int pageRow);
}

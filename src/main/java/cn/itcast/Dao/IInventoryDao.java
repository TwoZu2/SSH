package cn.itcast.Dao;

import cn.itcast.Entity.Inventory;

import java.util.Map;

public interface IInventoryDao{
    public boolean addInventory(Inventory inventory);
    public boolean updateInventory(Inventory inventory);
    public boolean deleteInventory(Inventory inventory);
    public Map findAllInventory(Inventory inventory, int currentPage, int pageRow);
    public Map FindLike(Class c, String str, int page, int limit);
}

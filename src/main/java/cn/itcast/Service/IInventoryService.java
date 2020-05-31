package cn.itcast.Service;

import cn.itcast.Entity.Inventory;

import java.util.Map;

public interface IInventoryService {
    public boolean addInventory(Inventory inventory);
    public boolean updateInventory(Inventory inventory);
    public boolean deleteInventory(Inventory inventory);
    public Map findAllInventory(Inventory inventory, int currentPage, int pageRow);
    public Map findLikeInventory(Inventory inventory, int currentPage, int pageRow);
}

package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IInventoryDao;
import cn.itcast.Entity.Inventory;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class InventoryDaoImpl implements IInventoryDao {

    @Autowired
    private Util util;

    @Override
    public boolean addInventory(Inventory inventory) {
        return util.SaveOrUpdate(inventory);
    }

    @Override
    public boolean updateInventory(Inventory inventory) {
        return util.SaveOrUpdate(inventory);
    }

    @Override
    public boolean deleteInventory(Inventory inventory) {
        return util.DeleteByID(inventory);
    }

    @Override
    public Map findAllInventory(Inventory inventory, int currentPage, int pageRow) {
        return util.FindAll(inventory.getClass(),currentPage,pageRow);
    }

    @Override
    public Map FindLike(Class c, String str, int page, int limit) {
        return null;
    }


}

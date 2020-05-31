package cn.itcast.Service.Impl;

import cn.itcast.Dao.IInventoryDao;
import cn.itcast.Entity.Inventory;
import cn.itcast.Service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class InventoryServiceImpl implements IInventoryService {

    @Autowired
    private IInventoryDao dao;

    @Override
    public boolean addInventory(Inventory inventory) {
        return dao.addInventory(inventory);
    }

    @Override
    public boolean updateInventory(Inventory inventory) {
        return dao.updateInventory(inventory);
    }

    @Override
    public boolean deleteInventory(Inventory inventory) {
        return dao.deleteInventory(inventory);
    }

    @Override
    public Map findAllInventory(Inventory inventory, int currentPage, int pageRow) {
        currentPage--;
        currentPage*=pageRow;
        Map map=dao.findAllInventory(inventory,currentPage,pageRow);
        Map map1=new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("data",map.get("data"));
        map1.put("count",map.get("count"));
        return map1;
    }

    @Override
    public Map findLikeInventory(Inventory inventory, int currentPage, int pageRow) {
        currentPage--;
        currentPage*=pageRow;
        Map map=dao.FindLike(inventory.getClass(),inventory.getItyName(),currentPage,pageRow);
        Map map1=new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("data",map.get("data"));
        map1.put("count",map.get("count"));
        return map1;
    }


}

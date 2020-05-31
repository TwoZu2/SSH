package cn.itcast.Service.Impl;

import cn.itcast.Dao.IStoragesDao;
import cn.itcast.Entity.Storages;
import cn.itcast.Service.IStoragesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class StoragesServiceImpl implements IStoragesService {
    @Autowired
    private IStoragesDao dao;
    @Override
    public boolean addStorages(Storages storages) {
        return dao.addStorages(storages);
    }

    @Override
    public boolean deleteStorages(Storages storages) {
        System.out.println("control................"+storages.getStoId());
        return dao.deleteStorages(storages);
    }

    @Override
    public boolean updateStorages(Storages storages) {
        return dao.updateStorages(storages);
    }

    @Override
    public Map findAllStorages(Storages storages, int currentPage, int pageRow) {
        currentPage--;
        currentPage*=pageRow;
        Map map=dao.findAllStorages(storages,currentPage,pageRow);
        Map map1=new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public Map findLikeInventory(Storages storages, int currentPage, int pageRow) {
        currentPage--;
        currentPage*=pageRow;
        Map map=dao.FindLike(storages.getClass(),storages.getUserName(),currentPage,pageRow);
        Map map1=new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("data",map.get("data"));
        map1.put("count",map.get("count"));
        return map1;
    }
}
















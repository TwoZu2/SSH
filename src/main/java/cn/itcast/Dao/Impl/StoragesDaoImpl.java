package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IStoragesDao;
import cn.itcast.Entity.Storages;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StoragesDaoImpl implements IStoragesDao {

    @Autowired
    private Util util;

    @Override
    public boolean addStorages(Storages storages) {
        return util.SaveOrUpdate(storages);
    }

    @Override
    public boolean deleteStorages(Storages storages) {
        return util.DeleteByID(storages);
    }

    @Override
    public boolean updateStorages(Storages storages) {
        return util.SaveOrUpdate(storages);
    }

    @Override
    public Map findAllStorages(Storages storages, int currentPage, int pageRow) {
        return util.FindAll(storages.getClass(),currentPage,pageRow);
    }

    @Override
    public Map FindLike(Class c, String str, int page, int limit) {
        return util.FindLike(c,str,page,limit);
    }
}

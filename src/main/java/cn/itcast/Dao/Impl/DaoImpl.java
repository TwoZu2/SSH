package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IDao;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class DaoImpl implements IDao {
    @Autowired
    Util util;

    @Override
    public Map findAll(Class z, int page, int no) {
        return util.FindAll(z,page,no);
    }

    @Override
    public Map findLike(Class c, String str, int page, int limit) {
        return util.FindLike(c,str,page,limit);
    }

    @Override
    public boolean save(Object object) {
        return util.SaveOrUpdate(object);
    }

    @Override
    public boolean updateById(Object object) {
        return util.SaveOrUpdate(object);
    }

    @Override
    public boolean deleteById(Object object) {
        return util.DeleteByID(object);
    }
}

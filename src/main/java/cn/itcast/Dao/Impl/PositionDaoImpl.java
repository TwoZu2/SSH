package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IPositionDao;
import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Map;


//String中的bean管理 注解
@Repository
public class PositionDaoImpl implements IPositionDao {
    @Autowired
    Util util;
    @Override
    public Map findAll(Class z, int page, int no) {
        return  util.FindAll(z,page,no) ;
    }
    @Override
    public Map findLike(Class c, Map map, int page, int limit) {
        return util.FindLike(c,map,page,limit);
    }
    @Override
    public boolean save(Location location) {
        return util.SaveOrUpdate(location);
    }
    @Override
    public boolean updateById(Location location) {
        return util.SaveOrUpdate(location);
    }
    @Override
    public boolean deleteById(Location location) {
        return util.DeleteByID(location);
    }
}

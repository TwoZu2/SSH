package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IReleaseDao;
import cn.itcast.Entity.Recruitment;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class ReleaseDaoImpl implements IReleaseDao {

    @Autowired
    Util util;

    @Override
    public Map FindAll(Class c, int page, int no) {
        return util.FindAll(c,page,no);
    }

    @Override
    public Map FindLike(Class c, Map map, int page, int limit) {
        return util.FindLike(c,map,page,limit);
    }
    @Override
    public boolean save(Recruitment recruitment) {
        return util.SaveOrUpdate(recruitment);
    }
    @Override
    public boolean UpdateById(Recruitment recruitment) {

        return util.SaveOrUpdate(recruitment);
    }
    @Override
    public boolean DeleteById(Recruitment recruitment) {
        return util.DeleteByID(recruitment);
    }
}

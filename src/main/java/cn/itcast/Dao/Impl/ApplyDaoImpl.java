package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IApplyDao;
import cn.itcast.Entity.Apply;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class ApplyDaoImpl implements IApplyDao {
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
    public boolean save(Apply apply) {
        return util.SaveOrUpdate(apply);
    }

    @Override
    public boolean UpdateById(Apply apply) {
        return util.SaveOrUpdate(apply);
    }

    @Override
    public boolean DeleteById(Apply apply) {
        return util.DeleteByID(apply);
    }
}

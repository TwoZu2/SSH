package cn.itcast.Dao.Impl;

import cn.itcast.Dao.INewsDao;
import cn.itcast.Entity.News;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class NewsDaoImpl implements INewsDao {
     @Autowired
    Util util;
    @Override
    public Map FindAll(Class c, int page, int no) {
        return util.FindAll(c,page,no);
    }
    @Override
    public Map FindLike(Class c, String str, int page, int limit) {
        return util.FindLike(c,str,page,limit);
    }

    @Override
    public boolean save(News news) {
        return util.SaveOrUpdate(news);
    }

    @Override
    public boolean UpdateById(News news) {
        return util.SaveOrUpdate(news);
    }

    @Override
    public boolean DeleteById(News news) {
        return util.DeleteByID(news);
    }
}

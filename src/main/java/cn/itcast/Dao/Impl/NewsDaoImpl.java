package cn.itcast.Dao.Impl;

import cn.itcast.Dao.INewsDao;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NewsDaoImpl implements INewsDao {
     @Autowired
    Util util;
    @Override
    public List<Object> FindAll() {
        return util.FindAll("asd");

    }
}

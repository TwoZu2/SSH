package cn.itcast.Dao.Impl;

import cn.itcast.Dao.IMesDao;
import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.Message;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MesDaoImpl implements IMesDao {
    @Autowired
    Util util;
    @Override
    public Map findAll(Class z, int page, int limit) {
        return util.FindAll(z,page,limit);
    }

    @Override
    public boolean UpdateById(Contactus message) {
       Contactus contactus= (Contactus) util.FindById(message.getClass(),message.getContId());
       System.out.println(contactus);
       if(message.getReplyContent()!=null) {
           contactus.setReplyContent(message.getReplyContent());
       }
       else {
           contactus.setRetshow(message.getRetshow());
       }
        return util.SaveOrUpdate(contactus);
    }

    @Override
    public boolean DeleteById(Contactus message) {
        return util.DeleteByID(message);
    }
    @Override
    public Map FindLike(Class c, Map map, int page, int limit) {

        return util.FindLike(c,map,page,limit);
    }
}

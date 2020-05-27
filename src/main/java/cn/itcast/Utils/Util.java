package cn.itcast.Utils;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface Util {
    //查询全部
    public Map FindAll(Class c, int page, int limit);
    //根据id查询
    public Object FindById(Class c,Integer id);
    //模糊查询
    public Map FindLike(Class c,Map<String,String> map,int page, int limit);
    //添加 修改
    public boolean SaveOrUpdate(Object obj);
    //删除
    public boolean DeleteByID(Object obj);
}

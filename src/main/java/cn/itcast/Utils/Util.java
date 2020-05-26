package cn.itcast.Utils;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;


public interface Util {
    public List<Object> FindAll(String hql);
    public Object FindById(Class c,Integer id);
    public boolean SaveOrUpdate(Object obj);
    public boolean DeleteByID(Object obj);
}

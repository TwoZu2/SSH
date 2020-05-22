package cn.itcast.Dao;

import cn.itcast.Entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;



public interface UserDao {
    public Object  FindUserById(User user);
    public boolean SaveUser(User user);
    public boolean DeleteUserById(User user);
    public boolean UpdateUserById(User user);

}

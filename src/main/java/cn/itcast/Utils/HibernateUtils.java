package cn.itcast.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtils {
    static Configuration cfg = null;
    static SessionFactory sessionFactory = null;
    static {
        //加载核心配置文件
        cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    //提供返回与本地线程帮的session的方法
    @Autowired
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}



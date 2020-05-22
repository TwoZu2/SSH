package cn.itcast.Dao.Impl;

import cn.itcast.Dao.UserDao;
import cn.itcast.Entity.User;
import cn.itcast.Utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    Util util;
    @Override
    public Object FindUserById(User user) {
        return util.FindById(user.getClass(),user.getUid());
    }

    @Override
    public boolean SaveUser(User user) {
        return util.SaveOrUpdate(user);
    }

    @Override
    public boolean DeleteUserById(User user) {
        return util.DeleteByID(user);
    }

    @Override
    public boolean UpdateUserById(User user) {
        return util.SaveOrUpdate(user);
    }
}

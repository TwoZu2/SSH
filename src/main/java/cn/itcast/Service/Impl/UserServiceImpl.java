package cn.itcast.Service.Impl;

import cn.itcast.Dao.UserDao;
import cn.itcast.Entity.User;
import cn.itcast.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;
    @Override
    public Object FindUserById(User user) {

      return    userDao.FindUserById(user);

    }

    @Override
    public boolean SaveUser(User user) {
        return userDao.SaveUser(user);
    }

    @Override
    public boolean DeleteUserById(User user) {
        return userDao.DeleteUserById(user);
    }

    @Override
    public boolean UpdateUserById(User user) {
        return userDao.UpdateUserById(user);
    }
}

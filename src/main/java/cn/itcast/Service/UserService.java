package cn.itcast.Service;

import cn.itcast.Entity.User;

public interface UserService {
    public Object  FindUserById(User user);
    public boolean SaveUser(User user);
    public boolean DeleteUserById(User user);
    public boolean UpdateUserById(User user);
}

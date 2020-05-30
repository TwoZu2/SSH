package cn.itcast.Service;

import cn.itcast.Entity.Administrator;

import java.util.Map;

public interface IAdminService {

    public boolean save(Administrator administrator);
    public boolean UpdateById(Administrator administrator);
    public Map FindAll(Administrator administrator, int page, int limit);
}

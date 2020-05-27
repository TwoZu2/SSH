package cn.itcast.Service;

import cn.itcast.Entity.Employees;
import cn.itcast.Entity.Location;

import java.util.Map;

public interface IStaffService {

    Map findAll(Employees employees, int page, int limit);
    Map findLike(Employees employees,int page, int limit);
    boolean save(Employees employees);
    boolean updateById(Employees employees);
    boolean deleteById(Employees employees);
}

package cn.itcast.Service;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;

import java.util.Map;

public interface IPositionService {

    Map findAll(Location location, int page, int limit);
    Map findLike(Location location,int page, int limit);
    boolean save(Location location);
    boolean updateById(Location location);
    boolean deleteById(Location location);
}

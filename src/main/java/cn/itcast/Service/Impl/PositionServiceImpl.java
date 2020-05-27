package cn.itcast.Service.Impl;

import cn.itcast.Entity.Location;
import cn.itcast.Service.IPositionService;

import java.util.Map;

public class PositionServiceImpl implements IPositionService {

    @Override
    public Map findAll(Location location, int page, int limit) {
        return null;
    }

    @Override
    public Map findLike(Location location, int page, int limit) {
        return null;
    }

    @Override
    public boolean save(Location location) {
        return false;
    }

    @Override
    public boolean updateById(Location location) {
        return false;
    }

    @Override
    public boolean deleteById(Location location) {
        return false;
    }
}

package cn.itcast.Service.Impl;

import cn.itcast.Dao.IPositionDao;
import cn.itcast.Entity.Location;
import cn.itcast.Service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service

public class PositionServiceImpl implements IPositionService {

    @Autowired
    IPositionDao positionDao;

    @Override
    public Map findAll(Location location, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=positionDao.findAll(location.getClass(),page,limit);
        //设置返回的json 格式 (layui 硬性要求)
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        //查询的总记录数
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public Map findLike(Location location, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();


        m.put("locName",location.getClass());

        Map map=positionDao.findLike(location.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public boolean save(Location location) {
      return positionDao.save(location);
    }

    @Override
    public boolean updateById(Location location) {
        return positionDao.updateById(location);
    }

    @Override
    public boolean deleteById(Location location) {
        return positionDao.deleteById(location);
    }
}

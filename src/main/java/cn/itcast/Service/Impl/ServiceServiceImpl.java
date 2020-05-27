package cn.itcast.Service.Impl;

import cn.itcast.Dao.IServiceDao;
import cn.itcast.Entity.Service;
import cn.itcast.Service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {

    @Autowired
    IServiceDao serviceDao;


    @Override
    public Map FindAll(Service service, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=serviceDao.FindAll(service.getClass(),page,limit);
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
    public Map FindLike(Service service, int page, int limit) {
        page--;
        page *= limit;
        Map map=serviceDao.FindLike(service.getClass(),service.getSerName(),page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public boolean save(Service service) {
        return serviceDao.save(service);
    }

    @Override
    public boolean UpdateById(Service service) {
        return serviceDao.UpdateById(service);
    }

    @Override
    public boolean DeleteById(Service service) {
        return serviceDao.DeleteById(service);
    }
}

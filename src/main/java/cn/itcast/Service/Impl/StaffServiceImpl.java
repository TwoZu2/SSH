package cn.itcast.Service.Impl;

import cn.itcast.Dao.IStaffDao;
import cn.itcast.Entity.Employees;
import cn.itcast.Service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service

public class StaffServiceImpl implements IStaffService {
    @Autowired
    IStaffDao staffDao;

    @Override
    public Map findAll(Employees employees, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=staffDao.findAll(employees.getClass(),page,limit);
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
    public Map findLike(Employees employees, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();


        m.put("postionId",employees.getPostionId());
        Map map=staffDao.findLike(employees.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public boolean save(Employees employees) {
        return staffDao.save(employees);
    }

    @Override
    public boolean updateById(Employees employees) {
        return staffDao.updateById(employees);
    }

    @Override
    public boolean deleteById(Employees employees) {
        return staffDao.deleteById(employees);
    }
}

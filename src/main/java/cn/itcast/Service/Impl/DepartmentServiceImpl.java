package cn.itcast.Service.Impl;

import cn.itcast.Dao.IDepartmentDao;
import cn.itcast.Entity.Department;
import cn.itcast.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    IDepartmentDao departmentDao;
    @Override
    public Map findAll(Department department, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=departmentDao.findAll(department.getClass(),page,limit);
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
    public Map findLike(Department department, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        m.put("depName",department.getClass());
        Map map=departmentDao.findLike(department.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public boolean save(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public boolean updateById(Department department) {
        return departmentDao.updateById(department);
    }

    @Override
    public boolean deleteById(Department department) {
        return departmentDao.deleteById(department);
    }
}

package cn.itcast.Service;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.News;

import java.util.Map;

public interface IDepartmentService {

     Map findAll(Department department, int page, int limit);
     Map findLike(Department department,int page, int limit);
     boolean save(Department department);
     boolean updateById(Department department);
     boolean deleteById(Department department);
}

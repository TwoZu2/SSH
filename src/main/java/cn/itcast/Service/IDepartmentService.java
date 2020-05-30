package cn.itcast.Service;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.News;

import java.util.Map;

public interface IDepartmentService {
     /**
      *查询的全部
      * @param department
      * @param page
      * @param limit
      * @return
      */
     Map findAll(Department department, int page, int limit);

     /**
      *模糊查询
      * @param department
      * @param page
      * @param limit
      * @return
      */
     Map findLike(Department department, int page, int limit);

     /**
      *保持
      * @param department
      * @return
      */
     boolean save(Department department);

     /**
      *
      * @param department
      * @return
      */
     boolean updateById(Department department);

     /**
      *
      * @param department
      * @return
      */
     boolean deleteById(Department department);
}

package cn.itcast.Dao;

import cn.itcast.Entity.Department;
import java.util.Map;

public interface IDepartmentDao {


    /**
     * 分页查询全部
     * @param z
     * @param page
     * @param no
     * @return
     */
    Map findAll(Class z, int page, int no);
    /**
     * 模糊查询并进行分页
     * @param c
     * @param map
     * @param page
     * @param limit
     * @return
     */
  Map findLike(Class c, Map map, int page, int limit);

    /**
     * 添加
     * @param department (实体类)
     * @return
     */
  boolean save(Department department);

    /**
     * 修改
     * @param department （实体类）
     * @return
     */
  boolean updateById(Department department);

    /**
     * 删除
     * @param department  （实体类）
     * @return
     */
  boolean deleteById(Department department);
}

package cn.itcast.Dao;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.Employees;

import java.util.Map;

public interface IStaffDao {
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
    Map findLike(Class c,Map map,int page, int limit);

    /**
     * 添加
     * @param department (实体类)
     * @return
     */
    boolean save(Employees employees);

    /**
     * 修改
     * @param department （实体类）
     * @return
     */
    boolean updateById(Employees employees);

    /**
     * 删除
     * @param department  （实体类）
     * @return
     */
    boolean deleteById(Employees employees);

}

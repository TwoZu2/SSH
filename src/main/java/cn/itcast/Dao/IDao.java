package cn.itcast.Dao;

import cn.itcast.Entity.Department;

import java.util.Map;

public interface IDao {
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
     * @param str
     * @param page
     * @param limit
     * @return
     */
    Map findLike(Class c,String str,int page, int limit);

    /**
     * 添加
     * @param
     * @return
     */
    boolean save(Object object);

    /**
     * 修改
     * @param （实体类）
     * @return
     */
    boolean updateById(Object object);

    /**
     * 删除
     * @param （实体类）
     * @return
     */
    boolean deleteById(Object object);
}

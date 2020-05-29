package cn.itcast.Dao;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;

import java.util.Map;

public interface IPositionDao {

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
     *
     * @return
     */
    boolean save(Location location);

    /**
     * 修改
     * @param （实体类）
     * @return
     */
    boolean updateById(Location location);

    /**
     * 删除
     * @param   （实体类）
     * @return
     */
    boolean deleteById(Location location);
}

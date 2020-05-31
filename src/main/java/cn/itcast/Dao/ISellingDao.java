package cn.itcast.Dao;

import cn.itcast.Entity.Selling;

import java.util.Map;

public interface ISellingDao {

    //添加方法
    public boolean addSelling(Selling selling);
    //修改方法
    public boolean updateSelling(Selling selling);
    //删除方法
    public boolean deleteSelling(Selling selling);
    //查询方法
    public Map findAll(Selling selling, int currentPage, int pageRow);

    //根据货物名修改库存
    public boolean updateInventory(int number, String invName);
    //模糊查询
    public Map FindLike(Class c, String str, int page, int limit);


}

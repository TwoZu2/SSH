package cn.itcast.Service;

import cn.itcast.Entity.Selling;

import java.util.Map;

public interface ISellingService {
    //添加方法
    public boolean addSelling(Selling selling);
    //修改方法
    public boolean updateSelling(Selling selling);
    //删除方法
    public boolean deleteSelling(Selling selling);
    //查询方法
    public Map findAll(Selling selling, int currentPage, int pageRow);
    //模糊
    public Map findLikeInventory(Selling selling, int currentPage, int pageRow);

}

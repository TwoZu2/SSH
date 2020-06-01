package cn.itcast.Dao;

import cn.itcast.Entity.Apply;
import cn.itcast.Entity.News;

import java.util.Map;

public interface IApplyDao {
    public Map FindAll(Class c, int page, int no);
    public Map FindLike(Class c,Map map,int page, int limit);
    public boolean save(Apply apply);
    public boolean UpdateById(Apply apply);
    public boolean DeleteById(Apply apply);

}

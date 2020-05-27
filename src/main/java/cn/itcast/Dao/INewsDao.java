package cn.itcast.Dao;

import cn.itcast.Entity.News;

import java.util.Map;

public interface INewsDao {
    public Map FindAll(Class z, int page, int no);
    public Map FindLike(Class c,Map map,int page, int limit);
    public boolean save(News news);
    public boolean UpdateById(News news);
    public boolean DeleteById(News news);

}

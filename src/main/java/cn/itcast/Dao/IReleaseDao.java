package cn.itcast.Dao;

import cn.itcast.Entity.News;
import cn.itcast.Entity.Recruitment;

import java.util.Map;

public interface IReleaseDao {
    public Map FindAll(Class c, int page, int no);
    public Map FindLike(Class c,Map map,int page, int limit);
    public boolean save(Recruitment recruitment);
    public boolean UpdateById(Recruitment recruitment);
    public boolean DeleteById(Recruitment recruitment);
}

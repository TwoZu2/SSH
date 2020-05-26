package cn.itcast.Service;

import cn.itcast.Entity.News;

import java.util.List;
import java.util.Map;

public interface INewsService {
    public Map FindAll(News news, int page, int limit);
    public Map FindLike(News news,int page, int limit);
    public boolean save(News news);
    public boolean UpdateById(News news);
    public boolean DeleteById(News news);
}

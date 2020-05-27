package cn.itcast.Service.Impl;

import cn.itcast.Dao.INewsDao;
import cn.itcast.Entity.News;
import cn.itcast.Service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
   INewsDao iNewsDao;
    @Override
    public Map FindAll(News news,int page,int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=iNewsDao.FindAll(news.getClass(),page,limit);
        //设置返回的json 格式 (layui 硬性要求)
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        //查询的总记录数
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public Map FindLike(News news, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        m.put("newTitle",news.getNewTitle());

        Map map=iNewsDao.FindLike(news.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }

    @Override
    public boolean save(News news) {
        return iNewsDao.save(news);
    }
    @Override
    public boolean UpdateById(News news) {
        return iNewsDao.UpdateById(news);
    }
    @Override
    public boolean DeleteById(News news) {
        return iNewsDao.DeleteById(news);
    }
}

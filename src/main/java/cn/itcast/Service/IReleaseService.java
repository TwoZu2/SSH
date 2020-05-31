package cn.itcast.Service;

import cn.itcast.Dao.IReleaseDao;
import cn.itcast.Entity.News;
import cn.itcast.Entity.Recruitment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public interface IReleaseService {

    public Map FindAll(Recruitment recruitment, int page, int limit);
    public Map FindLike(Recruitment recruitment,int page, int limit);
    public boolean save(Recruitment recruitment);
    public boolean UpdateById(Recruitment recruitment);
    public boolean DeleteById(Recruitment recruitment);
}

package cn.itcast.Service.Impl;

import cn.itcast.Dao.IReleaseDao;
import cn.itcast.Entity.Recruitment;
import cn.itcast.Service.IReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class ReleaseServiceImpl implements IReleaseService {
    @Autowired
    IReleaseDao releaseDao;

    @Override
    public Map FindAll(Recruitment recruitment, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map=releaseDao.FindAll(recruitment.getClass(),page,limit);
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
    public Map FindLike(Recruitment recruitment, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        m.put("retPostion",recruitment.getRetPostion());

        Map map=releaseDao.FindLike(recruitment.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }
    @Override
    public boolean save(Recruitment recruitment) {
        return releaseDao.save(recruitment);
    }

    @Override
    public boolean UpdateById(Recruitment recruitment) {
        return releaseDao.UpdateById(recruitment);
    }

    @Override
    public boolean DeleteById(Recruitment recruitment) {
        return releaseDao.DeleteById(recruitment);
    }
}
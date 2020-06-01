package cn.itcast.Service.Impl;

import cn.itcast.Dao.IApplyDao;
import cn.itcast.Entity.Apply;
import cn.itcast.Service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class ApplyServiceImpl implements IApplyService {
    @Autowired
    IApplyDao applyDao;

    @Override
    public Map FindAll(Apply apply, int page, int limit) {
        //计算分页查询
        page--;
        page *= limit;
        Map map = applyDao.FindAll(apply.getClass(),page,limit);
        //设置返回的json 格式 (layui 硬性要求)
        Map map1 = new HashMap();
        map1.put("code", 0);
        map1.put("msg", "");
        //查询的总记录数
        map1.put("count", map.get("count"));
        map1.put("data", map.get("data"));
        return map1;
    }

    @Override
    public Map FindLike(Apply apply, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        if(apply.getApyPostion()!=null&&apply.getApyPostion().length()>0) {
            m.put("apyPostion",apply.getApyPostion());
        }else {
            m.put("apyName",apply.getApyName());
        }

        Map map=applyDao.FindLike(apply.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }
    @Override
    public boolean save(Apply apply) {
        return applyDao.save(apply);
    }

    @Override
    public boolean UpdateById(Apply apply) {
        return applyDao.UpdateById(apply);
    }

    @Override
    public boolean DeleteById(Apply apply) {
        return applyDao.DeleteById(apply);
    }
}

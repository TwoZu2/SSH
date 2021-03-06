package cn.itcast.Service.Impl;

import cn.itcast.Dao.IAppoDao;
import cn.itcast.Dao.IRepDao;
import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Repairs;
import cn.itcast.Service.IRepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class RepService implements IRepService {
    @Autowired
    IRepDao iRepDao;

    public Map findAll(Repairs repairs , int page, int limit) {
        page--;
        page *= limit;
        Map map=iRepDao.findAll(repairs.getClass(),page,limit);
        //设置返回的json 格式 (layui 硬性要求)
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        //查询的总记录数
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }


    public boolean UpdateById(Repairs repairs) {
        return iRepDao.UpdateById(repairs);
    }

    public boolean DeleteById(Repairs repairs) {
        return iRepDao.DeleteById(repairs);
    }

    @Override
    public boolean save(Repairs repairs) {
        return iRepDao.save(repairs);
    }

    public Map FindLike(Repairs repairs, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        if(repairs.getRepName()!=null&&repairs.getRepName().length()>0){
            m.put("repName",repairs.getRepName());
        }if(repairs.getRepState()!=null&&repairs.getRepState().length()>0){
            m.put("repState",repairs.getRepState());
        }

        Map map=iRepDao.FindLike(repairs.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;

    }
}

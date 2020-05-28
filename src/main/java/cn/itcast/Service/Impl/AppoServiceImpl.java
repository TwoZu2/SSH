package cn.itcast.Service.Impl;

import cn.itcast.Dao.IAppoDao;
import cn.itcast.Dao.IMesDao;
import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Contactus;
import cn.itcast.Service.IAppoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class AppoServiceImpl implements IAppoService {
    @Autowired
    IAppoDao iAppoDao;

    public Map findAll(Appointment Appointment, int page, int limit) {
        page--;
        page *= limit;
        Map map=iAppoDao.findAll(Appointment.getClass(),page,limit);
        //设置返回的json 格式 (layui 硬性要求)
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        //查询的总记录数
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }


    public boolean UpdateById(Appointment appointment) {
        return iAppoDao.UpdateById(appointment);
    }

    public boolean DeleteById(Appointment appointment) {
        return iAppoDao.DeleteById(appointment);
    }

    public Map FindLike(Appointment appointment, int page, int limit) {
        page--;
        page *= limit;
        Map m = new HashMap();
        if(appointment.getAptName()!=null&&appointment.getAptName().length()>0){
            m.put("aptName",appointment.getAptName());
        }if(appointment.getServiceType()!=null&&appointment.getServiceType().length()>0){
            m.put("serviceType",appointment.getServiceType());
        }

        Map map=iAppoDao.FindLike(appointment.getClass(),m,page,limit);
        Map map1 = new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",map.get("count"));
        map1.put("data",map.get("data"));
        return map1;
    }
}

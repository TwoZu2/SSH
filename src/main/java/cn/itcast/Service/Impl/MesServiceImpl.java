package cn.itcast.Service.Impl;

import cn.itcast.Dao.IMesDao;
import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.Message;
import cn.itcast.Service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Transactional
@Service
public class MesServiceImpl implements IMesService {
    @Autowired
    IMesDao iMesDao;
    @Override
    public Map findAll(Contactus message, int page, int limit) {
        page--;
        page *= limit;
        Map map=iMesDao.findAll(message.getClass(),page,limit);
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
    public boolean UpdateById(Contactus message) {
        return iMesDao.UpdateById(message);
    }
    @Override
    public boolean DeleteById(Contactus message) {
        return iMesDao.DeleteById(message);
    }
}

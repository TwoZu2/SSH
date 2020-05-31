package cn.itcast.Service.Impl;

import cn.itcast.Dao.ISellingDao;
import cn.itcast.Entity.Selling;
import cn.itcast.Service.ISellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class SellingServiceImpl implements ISellingService {

    @Autowired
    private ISellingDao dao;

    @Override
    public boolean addSelling(Selling selling) {
        try {
            dao.addSelling(selling);
            //dao.updateInventory(selling.getSelNumber(),selling.getSelName());
            return true;
        }catch(Exception e){
            return false;
        }

    }

    @Override
    public boolean updateSelling(Selling selling) {
        return dao.updateSelling(selling);
    }

    @Override
    public boolean deleteSelling(Selling selling) {
        return dao.deleteSelling(selling);
    }

    @Override
    public Map findAll(Selling selling, int currentPage, int pageRow) {
        //计算分页查询
        currentPage--;
        currentPage *= pageRow;
        Map map=dao.findAll(selling,currentPage,pageRow);
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
    public Map findLikeInventory(Selling selling, int currentPage, int pageRow) {
        currentPage--;
        currentPage*=pageRow;
        Map map=dao.FindLike(selling.getClass(),selling.getUserName(),currentPage,pageRow);
        Map map1=new HashMap();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("data",map.get("data"));
        map1.put("count",map.get("count"));
        return map1;
    }
}

package cn.itcast.Service.Impl;

import cn.itcast.Dao.IAdminDao;
import cn.itcast.Entity.Administrator;
import cn.itcast.Service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional
@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    IAdminDao iAdminDao;
    @Override
    public boolean save(Administrator administrator) {
        return iAdminDao.save(administrator);
    }

    @Override
    public boolean UpdateById(Administrator administrator) {
        return iAdminDao.UpdateById(administrator);
    }
    @Override
    public Map FindAll(Administrator administrator, int page, int limit) {
        return  iAdminDao.FindAll(administrator ,page, limit);
    }
}

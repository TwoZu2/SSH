package cn.itcast.Service;

import cn.itcast.Entity.Apply;
import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.News;

import java.util.Map;

public interface IApplyService {

    public Map FindAll(Apply apply, int page, int limit);
    public Map FindLike(Apply apply,int page, int limit);
    public boolean save(Apply apply);
    public boolean UpdateById(Apply apply);
    public boolean DeleteById(Apply apply);
}

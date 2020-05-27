package cn.itcast.Service;

import cn.itcast.Entity.Service;

import java.util.Map;

public interface IServiceService {
    public Map FindAll(Service service, int page, int limit);
    public Map FindLike(Service service,int page, int limit);
    public boolean save(Service service);
    public boolean UpdateById(Service service);
    public boolean DeleteById(Service service);
}

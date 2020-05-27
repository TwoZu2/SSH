package cn.itcast.Service;

import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.Message;
import cn.itcast.Entity.News;

import java.util.Map;

public interface IMesService {
    Map findAll(Contactus message, int page, int limit);
      Map FindLike(Contactus message, int page, int limit);
    boolean UpdateById(Contactus message);
    boolean DeleteById(Contactus message);
}

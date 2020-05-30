package cn.itcast.Service;

import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Repairs;

import java.util.Map;

public interface IRepService {
    Map findAll(Repairs repairs, int page, int limit);
    Map FindLike(Repairs repairs, int page, int limit);
    boolean UpdateById(Repairs repairs);
    boolean DeleteById(Repairs repairs);
}

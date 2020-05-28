package cn.itcast.Service;

import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Contactus;

import java.util.Map;

public interface IAppoService {
    Map findAll(Appointment appointment, int page, int limit);
    Map FindLike(Appointment appointment, int page, int limit);
    boolean UpdateById(Appointment appointment);
    boolean DeleteById(Appointment appointment);
}

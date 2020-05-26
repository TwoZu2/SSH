package cn.itcast.Service;


import cn.itcast.Entity.Employees;
import org.json.JSONException;

import java.sql.SQLException;

public interface IstaffService {
    int  selectcont(Employees employees) throws SQLException;
    public String selectAll(Employees employees, int page, int no) throws SQLException, JSONException;
    boolean add(Employees employees) throws SQLException;
    boolean delete(Employees employees) throws SQLException;
    boolean update(Employees employees) throws SQLException;
}

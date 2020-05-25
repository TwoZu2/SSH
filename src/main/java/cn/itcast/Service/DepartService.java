package cn.itcast.Service;


import cn.itcast.Entity.Department;
import org.json.JSONException;

import java.sql.SQLException;

public interface DepartService {

    int  selectcont(String name) throws SQLException;
    String selectAll(String name,int page, int no) throws SQLException, JSONException;
    boolean add(Department department) throws SQLException;
    boolean delete(Department department) throws SQLException;
    boolean update(Department department) throws SQLException;
}

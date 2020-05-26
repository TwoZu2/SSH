package cn.itcast.Dao;

import cn.itcast.Entity.Employees;
import org.json.JSONException;

import java.sql.SQLException;
import java.util.List;

public interface IstaffDao {
    List<? extends Object> selectAll(Employees employees, int page, int no) throws SQLException, JSONException;
    boolean add(Employees employees) throws SQLException;
    boolean delete(Employees employees) throws SQLException;
    boolean update(Employees employees) throws SQLException;

    List select(String s, Employees employees);

    List selectxia(String s, Integer postionId);

    List select(String s);
}

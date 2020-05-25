package cn.itcast.Dao;

import cn.itcast.Entity.Department;
import cn.itcast.Entity.User;
import org.json.JSONException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DepartDao {
    //Department实体类
    //模糊查询

    List<Department> selectDepartment(String name,int page,int no);
    //添加
    boolean saveDepartment(Department department);
    //删除
    boolean deleteDepartment(Department department);
    //修改
    boolean updateDepartment(Department department);
}

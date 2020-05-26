package cn.itcast.Dao.Impl;


import cn.itcast.Dao.IstaffDao;
import cn.itcast.Entity.Employees;
import cn.itcast.Utils.Util;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * 员工Dao
 */
@Repository
public class staffDao implements IstaffDao {
   @Autowired
    Util util;


   //分页
    @Override
    public List<? extends Object> selectAll(Employees employees, int page, int no) throws SQLException, JSONException {
        String sql = null;

        if(employees.getPostionId()>0){
            System.out.println("执行外键");
            sql="select * from employees where PostionId=? limit ?,?";

            return  util.selectxia(sql, employees.getPostionId(),page,no);
        }
        if (employees.getEmpName() != null) {

            sql = "select * from location where  DepName like ? limit ?,?";

            return util.select(sql, employees, page, no);
        } else {
            sql = "select * from employees limit ?,?";
            System.out.println("new");

            return util.select(sql, page, no);


        }
    }

    //添加员工
    @Override
    public boolean add(Employees employees) throws SQLException {
        return util.SaveOrUpdate(employees);
    }

    //删除员工
    @Override
    public boolean delete(Employees employees) throws SQLException {
        return  util.DeleteByID(employees);
    }

    //更新员工
   @Override
    public boolean update(Employees employees) throws SQLException {
        return util.SaveOrUpdate(employees);
    }
}

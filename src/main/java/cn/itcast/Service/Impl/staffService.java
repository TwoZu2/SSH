package cn.itcast.Service.Impl;


import cn.itcast.Dao.IstaffDao;
import cn.itcast.Entity.Employees;
import cn.itcast.Service.IstaffService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

@Service
@Transactional
public class staffService implements IstaffService {
    @Autowired
    IstaffDao sta;
    @Override
    public int selectcont(Employees employees) throws SQLException {
        List list;
        if(employees.getEmpName()!=null){

            System.out.println("查询模糊"+ employees.getEmpName());
            list= sta.select("select count(*) from employees where LocName=?", employees);
        }if(employees.getPostionId()>0){
            list = sta.selectxia("select count(*) from employees where PostionId=?", employees.getPostionId());
        }else {

            list = sta.select("select count(*) from employees");
        }
        int num = 0;
        for(int i = 0; i<list.size(); i++){
            num= (int) list.get(i);
        }

        return num;
    }

    @Override
    public String selectAll(Employees employees, int page, int no) throws SQLException, JSONException {
        --page;
        page *= no;

        JSONObject jsonObject;
        ResultSet res = null;

        JSONArray array = new JSONArray();
        ResultSetMetaData metaData;
        int columnCount = 0;


        res = (ResultSet) sta.selectAll(employees, page, no);

        res.last(); //结果集指针知道最后一行数据
        int n = res.getRow();


        res.beforeFirst();

        metaData = res.getMetaData();
        columnCount = metaData.getColumnCount();
        //遍历ResultSet中的每条数据
        //
        while (res.next()) {
            JSONObject jsonObj = new JSONObject();
            //   遍历每一列
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnLabel(i);
                String value = res.getString(columnName);
                jsonObj.put(columnName, value);

            }

            array.put(jsonObj);

        }

        jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        if(employees.getEmpName()!=null){
            System.out.println("查询模糊条数");
            jsonObject.put("count", this.selectcont(employees));
        }
        if(employees.getPostionId()>0){
            System.out.println(this.selectcont(employees));
            jsonObject.put("count",this.selectcont(employees));
        }else{

            jsonObject.put("count", this.selectcont(employees));
        }

        jsonObject.put("data", array);

        return jsonObject.toString();
    }

    @Override
    public boolean add(Employees employees) throws SQLException {
        return sta.add(employees);
    }

    @Override
    public boolean delete(Employees employees) throws SQLException {
        return  sta.delete(employees);
    }

    @Override
    public boolean update(Employees employees) throws SQLException {
        return sta.update(employees);
    }
}

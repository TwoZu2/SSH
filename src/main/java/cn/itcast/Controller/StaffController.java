package cn.itcast.Controller;

import cn.itcast.Entity.Employees;
import cn.itcast.Service.IStaffService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.xml.ws.soap.Addressing;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StaffController extends ActionSupport implements ModelDriven<Employees> {

    @Autowired
    IStaffService staffService;
    @Autowired
    Employees employees;

    private String page;
    private String limit;

    public String getPage() {

        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    private Map map = new HashMap();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    /*
    人员管理的一套

   */
    public String save(){
        System.out.println("save");
        System.out.println(employees);
        employees.setEmpId(0);
        if(staffService.save(employees)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        employees.setEmpName(null);
        return SUCCESS;
    }
    public String update(){
        System.out.println("update");
        System.out.println(employees);
        if(staffService.updateById(employees)){
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String delete(){
        System.out.println(employees);
        System.out.println(employees);
        if(staffService.deleteById(employees)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        employees.setEmpName(null);
        return SUCCESS;
    }
    public String find(){
        System.out.println("find");
        System.out.println(employees.getPostionId());
        //判断是否模糊查询
        if(employees.getPostionId() != null && employees.getPostionId().length()>0){
            map= staffService.findLike(employees,Integer.parseInt(page),Integer.parseInt(limit));
            return "success";
        }else {
            System.out.println("22222222222222222222222222222222222222222222222222222222222222");
            map = staffService.findAll(employees,Integer.parseInt(page), Integer.parseInt(limit));
            System.out.println(map);
            return "success";
        }
    }
    @Override
    public Employees getModel() {
        return employees;
    }
}

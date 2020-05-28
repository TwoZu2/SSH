package cn.itcast.Controller;

import cn.itcast.Entity.Department;
import cn.itcast.Service.IDepartmentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DepartmentController  extends  ActionSupport implements ModelDriven<Department> {
    @Autowired
    IDepartmentService departmentService;
    @Autowired
    Department department;


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
    /**
     * 部门管理的一套
     *
     */
    public String save(){
        System.out.println("save");
        department.setDepId(0);
        if(departmentService.save(department)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        department.setDepName(null);
        return SUCCESS;
    }
    public String delete(){
        System.out.println("delete");
        System.out.println(department);
        if(departmentService.deleteById(department)){
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String update(){
        System.out.println("update");
        System.out.println(department);
        if(departmentService.updateById(department)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        department.setDepName(null);
        return SUCCESS;
    }
    public String  find(){
        System.out.println("find");
        System.out.println(department.getDepName());
        //判断是否模糊查询
        if(department.getDepName() !=null&&department.getDepName().length()>0){
            map= departmentService.findLike(department,Integer.parseInt(page),Integer.parseInt(limit));
            return "success";
        }else {
            map = departmentService.findAll(department, Integer.parseInt(page), Integer.parseInt(limit));
            System.out.println(map);
            return "success";
        }
    }
    @Override
    public Department getModel() {

        return department;
    }
}

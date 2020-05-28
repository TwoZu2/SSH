package cn.itcast.Controller;

import cn.itcast.Entity.Employees;
import cn.itcast.Entity.Location;
import cn.itcast.Service.IPositionService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class PositionController extends ActionSupport implements ModelDriven<Location> {
    @Autowired
    Location location;
    @Autowired
    IPositionService positionService;

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
   position(职位管理)的一套
    */
    public String  save(){
        System.out.println("save");
        location.setLocId(0);
        if(positionService.save(location)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        location.setLocName(null);
        return SUCCESS;
    }

    public String delete(){
        System.out.println("delete");
        if(positionService.deleteById(location)){
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String update(){
        System.out.println("update");

        System.out.println(location.getLocId());
        if(positionService.updateById(location)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        location.setLocName(null);
        return SUCCESS;
    }
    public String find(){
        System.out.println("find");
        System.out.println(page);
        System.out.println(limit);
        System.out.println(location.getDeparId());
        //判断是否模糊查询
        if(location.getDeparId() != null && location.getDeparId().length()>0){
            map= positionService.findLike(location,Integer.parseInt(page),Integer.parseInt(limit));
            return "success";
        }else {
            System.out.println("22222222222222222222222222222222222222222222222222222222222222");

            map =  positionService.findAll(location, Integer.parseInt(page), Integer.parseInt(limit));
            //System.out.println(positionService.findAll(location, Integer.parseInt(page), Integer.parseInt(limit)));
            System.out.println(map);
            return "success";
        }
    }

    @Override
    public Location getModel() {
        return location;
    }
}

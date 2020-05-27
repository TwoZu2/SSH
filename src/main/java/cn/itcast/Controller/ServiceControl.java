package cn.itcast.Controller;

import cn.itcast.Entity.Service;
import cn.itcast.Service.IServiceService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ServiceControl extends ActionSupport implements ModelDriven {
    @Autowired
    IServiceService serviceService;

    @Autowired
    private Service service;

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


    public String save(){

        service.setSerId(0);
        if(serviceService.save(service)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        service.setSerName(null);
        return SUCCESS;
    }


    public String update(){
        System.out.println(service);
        if(serviceService.UpdateById(service)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        service.setSerName(null);
        return SUCCESS;
    }

    public String delete(){


        if(serviceService.DeleteById(service)){

            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }

    public String findService() throws IOException {
        //判断是否模糊查询
        if(service.getSerName()!=null&&service.getSerName().length()>0){

            map= serviceService.FindLike(service,Integer.parseInt(page),Integer.parseInt(limit));

            return "success";
        }


        map = serviceService.FindAll(service,Integer.parseInt(page),Integer.parseInt(limit));


        return "success";





    }

    @Override
    public Object getModel() {
        return service;
    }
}

package cn.itcast.Controller;

import cn.itcast.Entity.Selling;
import cn.itcast.Service.ISellingService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SellingController extends ActionSupport implements ModelDriven<Selling> {
    @Autowired
    private Selling selling;

//    @Autowired
//    private ISellingDao dao;

    @Autowired
    private ISellingService service;


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

    private Map map=new HashMap();



    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    //添加出库记录
    public String add(){
        System.out.println("sellingControl........"+selling.getSelName()+"");
        if(service.addSelling(selling)){
            map.put("msg","1");
        }else{
            map.put("msg","0");
        }
        selling.setUserName(null);
        return SUCCESS;
    }

    //查询所有出库记录
    public String findAll(){
        if(selling.getUserName()!=null){
            map=service.findLikeInventory(selling,Integer.parseInt(page),Integer.parseInt(limit));
        }else {
            map = service.findAll(selling, Integer.parseInt(page), Integer.parseInt(limit));
        }

        return SUCCESS;
    }

    //修改出库数据
    public String edit(){


        if(service.updateSelling(selling)){

            map.put("msg","1");

        }else{

            map.put("msg","0");

        }
        return SUCCESS;
    }
    public String delete(){

        //System.out.println("controller"+selling.getSelId());
        if(service.deleteSelling(selling)){
            map.put("msg","1");
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }
    @Override
    public Selling getModel() {
        return selling;
    }
}

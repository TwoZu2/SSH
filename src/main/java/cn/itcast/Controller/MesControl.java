package cn.itcast.Controller;

import cn.itcast.Entity.Contactus;
import cn.itcast.Entity.Message;
import cn.itcast.Service.IMesService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MesControl extends ActionSupport implements ModelDriven<Contactus> {
    @Autowired
    IMesService iMesService;
@Autowired
  private    Contactus message;
    private Map map = new HashMap();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

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
    public String findAll(){

        if((message.getRetshow()!=null&&message.getRetshow().length()>0)||message.getContName()!=null&&message.getContName().length()>0){


            map = iMesService.FindLike(message,Integer.parseInt(page),Integer.parseInt(limit));


            return SUCCESS;

        }
        map = iMesService.findAll(message,Integer.parseInt(page),Integer.parseInt(limit));
        System.out.println(map);
        return SUCCESS;
    }
    public String update(){

        if(iMesService.UpdateById(message)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }
        public String delete(){

            if(iMesService.DeleteById(message)){

                map.put("msg","1");
            }else {

                map.put("msg","0");
            }
            return SUCCESS;
        }
    @Override
    public Contactus getModel() {
        return message;
    }
}

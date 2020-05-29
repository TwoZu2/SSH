package cn.itcast.Controller;

import cn.itcast.Entity.Appointment;
import cn.itcast.Entity.Repairs;
import cn.itcast.Service.IAppoService;
import cn.itcast.Service.IRepService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RepControl extends ActionSupport implements ModelDriven<Repairs> {
    @Autowired
    IRepService iRepService;
    @Autowired
    private Repairs repairs;
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
        System.out.println(repairs);
//        if((appointment.getAptName()!=null&&repairs.getAptName().length()>0)||appointment.getServiceType()!=null&&appointment.getServiceType().length()>0){
//
//
//            map = iAppoService.FindLike(repairs,Integer.parseInt(page),Integer.parseInt(limit));
//
//            System.out.println(map);
//            return SUCCESS;
//
//        }
        map = iRepService.findAll(repairs,Integer.parseInt(page),Integer.parseInt(limit));
        System.out.println(map);
        return SUCCESS;
    }
    public String update(){
//
//        if(iMesService.UpdateById(message)){
//            System.out.println(1);
//            map.put("msg","1");
//        }else {
//            System.out.println(0);
//            map.put("msg","0");
//        }
        return SUCCESS;
    }
    public String delete(){

        if(iRepService.DeleteById(repairs)){

            map.put("msg","1");
        }else {

            map.put("msg","0");
        }
        return SUCCESS;
    }
    @Override
    public Repairs getModel() {
        return repairs;
    }
}

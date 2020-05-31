package cn.itcast.Controller;


import cn.itcast.Entity.Recruitment;
import cn.itcast.Service.IReleaseService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReleaseController extends ActionSupport implements ModelDriven<Recruitment> {
    @Autowired
    IReleaseService releaseService;
    @Autowired
    Recruitment recruitment;
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
        recruitment.setRetId(0);
        if(releaseService.save(recruitment)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        recruitment.setRetPostion(null);
        return SUCCESS;
    }

    public String update(){
        System.out.println(recruitment);
        if(releaseService.UpdateById(recruitment)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        recruitment.setRetPostion(null);
        return SUCCESS;
    }
    public String delete(){
        System.out.println(recruitment);
        if(releaseService.DeleteById(recruitment)){
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String find() throws IOException {
        //判断是否模糊查询
        if(recruitment.getRetPostion()!=null&&recruitment.getRetPostion().length()>0){
            map= releaseService.FindLike(recruitment,Integer.parseInt(page),Integer.parseInt(limit));
            return "success";
        }
        map = releaseService.FindAll(recruitment,Integer.parseInt(page),Integer.parseInt(limit));

        return "success";

    }
    @Override
    public Recruitment getModel() {
        return recruitment;
    }
}

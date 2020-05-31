package cn.itcast.Controller;

import cn.itcast.Entity.Apply;
import cn.itcast.Service.IApplyService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Controller
public class ApplyController extends ActionSupport implements ModelDriven<Apply> {
    @Autowired
    Apply apply;
    @Autowired
    IApplyService applyService;

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

        apply.setApyId(0);
        if(applyService.save(apply)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        apply.setApyPostion(null);
        return SUCCESS;
    }

    public String update(){
        System.out.println(apply);
        if(applyService.UpdateById(apply)){
            System.out.println(1);
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        apply.setApyPostion(null);
        return SUCCESS;
    }
    public String delete(){

        System.out.println(apply);
        if(applyService.DeleteById(apply)){

            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }

    public String find() throws IOException {
        //判断是否模糊查询
        if(apply.getApyPostion()!=null&&apply.getApyPostion().length()>0){

            map= applyService.FindLike(apply,Integer.parseInt(page),Integer.parseInt(limit));

            return "success";
        }


        map = applyService.FindAll(apply,Integer.parseInt(page),Integer.parseInt(limit));
        return "success";
    }
    @Override
    public Apply getModel() {
        return apply;
    }
}

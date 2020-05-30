package cn.itcast.Controller;

import cn.itcast.Entity.Administrator;
import cn.itcast.Service.IAdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
public class AdminControl extends ActionSupport implements ModelDriven<Administrator> {
    @Autowired
    IAdminService iAdminService;
    @Autowired
    Administrator administrator;
    private Map map = new HashMap();


    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String save() {
        System.out.println("执行到了添加方法");
        System.out.println(administrator.getAdminName());
        /**
         * 返回msg判断是否添加成功
         */
        administrator.setAdminId(0);
        if (iAdminService.save(administrator)) {

            map.put("msg", "1");
        } else {
            map.put("msg", "0");
        }
        return SUCCESS;
    }


    public String find() {

        System.out.println(administrator.getAdminName() + administrator.getAdminPassword());
        Map map1 = iAdminService.FindAll(administrator, 0, 10);
        List<Administrator> list = (List<Administrator>) map1.get("data");

        for (Administrator administrator1 : list) {
            System.out.println(administrator1.getAdminName()+administrator1.getAdminPassword());
            if (administrator.getAdminName().equals(administrator1.getAdminName()) && administrator.getAdminPassword().equals(administrator1.getAdminPassword())) {
                map.put("msg", "1");
                return SUCCESS;
            }
            map.put("msg", "0");
        }
        return SUCCESS;
    }




    public String update(){

        System.out.println(administrator.getAdminName() + administrator.getAdminPassword());
        Map map1 = iAdminService.FindAll(administrator, 0, 10);
        List<Administrator> list = (List<Administrator>) map1.get("data");

        for (Administrator administrator1 : list) {
            System.out.println(administrator1.getAdminName()+administrator1.getAdminPassword());
            if (administrator.getAdminName().equals(administrator1.getAdminName()) ) {
                administrator1.setAdminPassword(administrator.getAdminPassword());
                if(iAdminService.UpdateById(administrator1)){
                    map.put("msg", "1");
                    return SUCCESS;
                }
            }
            map.put("msg", "0");
        }
        return SUCCESS;

    }

    @Override
    public Administrator getModel() {
        return administrator;
    }
}

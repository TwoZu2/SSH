package cn.itcast.Controller;


import cn.itcast.Dao.INewsDao;
import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;
import cn.itcast.Entity.News;


import cn.itcast.Utils.Util;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class UserControl extends ActionSupport  {


    @Autowired
    INewsDao iNewsDao;
        @Autowired
    Util util;
    private  String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


      private   Map map = new HashMap();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String save(){

        System.out.println("测试修改");
//        userService.SaveUser(user);
        System.out.println("as");
        return SUCCESS;
    }

    public String update(){
      // boolean b= userService.UpdateUserById(user);
        return SUCCESS;
    }
    public String delete(){
//      boolean b=  userService.DeleteUserById(user);
        return SUCCESS;
    }

    public String findUser() throws IOException {
    System.out.println(username);
    List k = iNewsDao.FindAll();

        map.put("code",0);
        map.put("msg","");
        map.put("count",k.size());
        map.put("data",k);
        return "success";


    }

}

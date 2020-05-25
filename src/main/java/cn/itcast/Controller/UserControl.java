package cn.itcast.Controller;


import cn.itcast.Dao.INewsDao;
import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;
import cn.itcast.Entity.News;
import cn.itcast.Entity.User;
import cn.itcast.Service.UserService;

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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserControl extends ActionSupport implements ModelDriven {
    @Autowired
    private User user ;
    @Autowired
    private UserService userService;
    @Autowired
    INewsDao iNewsDao;
        @Autowired
    Util util;
// private  JSONArray array ;
//
//    public JSONArray getArray() {
//        return array;
//    }
//
//    public void setArray(JSONArray array) {
//        this.array = array;
//    }

    public String save(){

        System.out.println("测试修改");
        userService.SaveUser(user);
        System.out.println("as");
        return SUCCESS;
    }

    public String update(){
       boolean b= userService.UpdateUserById(user);
        return SUCCESS;
    }
    public String delete(){
      boolean b=  userService.DeleteUserById(user);
        return SUCCESS;
    }

    public String findUser() throws UnsupportedEncodingException {

    List<Object> k = iNewsDao.FindAll();
        System.out.println(k.size());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","");
        jsonObject.put("count",k.size());
        jsonObject.put("date",k);

        System.out.println(jsonObject);

//          System.out.println(util.FindById(Location.class,1));

        return SUCCESS ;

    }
    @Override
    public User getModel() {
        return user;
    }
}

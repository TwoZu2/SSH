package cn.itcast.Controller;


import cn.itcast.Entity.User;
import cn.itcast.Service.UserService;
import com.mysql.cj.xdevapi.JsonArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
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
        System.out.println(user);
        System.out.println("测试111111111111111111");
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
    @Test
    public String findUser() throws UnsupportedEncodingException {
//      Object obj=  userService.FindUserById(user);
//
//      System.out.println(obj);
//        return SUCCESS;
        List a = new ArrayList();
        user.setUid(1);
        user.setUsername("ss");
        user.setPassword("sad");
        a.add(user);
        System.out.println("as");

//      JSONArray array=   JSONArray.fromObject(a);
//      array.add("d",)
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("date",a);
        jsonObject.put("msg","成功");
        System.out.println(jsonObject);



        return SUCCESS ;

    }
    @Override
    public User getModel() {
        return user;
    }
}

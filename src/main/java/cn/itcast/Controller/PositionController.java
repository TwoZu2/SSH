package cn.itcast.Controller;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

@Controller
public class PositionController extends ActionSupport {

    /*
   position(职位管理)的一套
    */
    public String  save(){
        System.out.println("save");
        return SUCCESS;
    }

    public String delete(){
        System.out.println("delete");
        return SUCCESS;
    }
    public String update(){
        System.out.println("update");
        return  SUCCESS;
    }
    public String find(){
        System.out.println("find");
        return SUCCESS;
    }
}

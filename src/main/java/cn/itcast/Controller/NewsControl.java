package cn.itcast.Controller;


import cn.itcast.Dao.INewsDao;
import cn.itcast.Entity.Department;
import cn.itcast.Entity.Location;
import cn.itcast.Entity.News;


import cn.itcast.Service.INewsService;
import cn.itcast.Utils.Util;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.internal.build.AllowSysOut;
import org.json.JSONArray;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
public class NewsControl extends ActionSupport implements ModelDriven<News> {


    @Autowired
    INewsService iNewsService;

        @Autowired
        private News news;

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

    private   Map map = new HashMap();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String save(){

        news.setNewId(0);
       if(iNewsService.save(news)){
           System.out.println(1);
           map.put("msg","1");
       }else {
           System.out.println(0);
           map.put("msg","0");
       }
        news.setNewTitle(null);
        return SUCCESS;
    }

    public String update(){
        System.out.println(news);
      if(iNewsService.UpdateById(news)){
          System.out.println(1);
          map.put("msg","1");
      }else {
          System.out.println(0);
          map.put("msg","0");
      }
      news.setNewTitle(null);
        return SUCCESS;
    }
    public String delete(){

        System.out.println(news);
        if(iNewsService.DeleteById(news)){
            map.put("msg","1");
        }else {
            System.out.println(0);
            map.put("msg","0");
        }
        return SUCCESS;
    }

    public String findUser() throws IOException {
                //判断是否模糊查询
                if(news.getNewTitle()!=null&&news.getNewTitle().length()>0){

                  map= iNewsService.FindLike(news,Integer.parseInt(page),Integer.parseInt(limit));

                    return "success";
                }


                map = iNewsService.FindAll(news,Integer.parseInt(page),Integer.parseInt(limit));



                return "success";



    }

    @Override
    public News getModel() {
        return news;
    }
}

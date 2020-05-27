package cn.itcast.Controller;


import cn.itcast.Entity.News;
import cn.itcast.Service.INewsService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


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

package cn.itcast.Controller;

import cn.itcast.Entity.Storages;
import cn.itcast.Service.IStoragesService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StoragesControl extends ActionSupport implements ModelDriven<Storages> {

    @Autowired
    private Storages storages;

    @Autowired
    private IStoragesService service;

    private int currentPage;
    private int pageRow;
    private Map map=new HashMap();

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageRow() {
        return pageRow;
    }

    public void setPageRow(int pageRow) {
        this.pageRow = pageRow;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    //查全部
    public String findAll(){

        if(storages.getUserName()!=null){
            map=service.findLikeInventory(storages,currentPage,pageRow);
        }else {
            map = service.findAllStorages(storages, currentPage, pageRow);
        }
        return SUCCESS;
    }
    //添加
    public String add(){
        if(service.addStorages(storages)){
            map.put("msg","1");
            //因为我们在模糊查询那里用userName进行判断，但是页面一刷新就会执行findAll，所以我们将userName设为空
            storages.setUserName(null);
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }
    //添加
    public String update(){
        System.out.println("control..............."+storages.getUserName());
        if(service.updateStorages(storages)){
            map.put("msg","1");
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }
    //添加
    public String delete(){
        if(service.deleteStorages(storages)){
            System.out.println(storages.getStoId());
            map.put("msg","1");
        }else{
            System.out.println("删除失败");
            map.put("msg","0");
        }
        return SUCCESS;
    }
    @Override
    public Storages getModel() {
        return storages;
    }
}

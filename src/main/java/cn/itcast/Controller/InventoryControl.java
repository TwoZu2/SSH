package cn.itcast.Controller;

import cn.itcast.Entity.Inventory;
import cn.itcast.Service.IInventoryService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class InventoryControl extends ActionSupport implements ModelDriven<Inventory> {

    @Autowired
    private Inventory inventory;

    @Autowired
    private IInventoryService service;

    private int currentPage;
    private int pageRow;
    private Map map;

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

    public String findAll(){

        if(inventory.getItyName()!=null){
            map=service.findLikeInventory(inventory,currentPage,pageRow);
        }else {
            map = service.findAllInventory(inventory, currentPage, pageRow);
        }


        return SUCCESS;
    }

    public String add(){

        if(service.addInventory(inventory)){
            map.put("msg","1");
            inventory.setItyName(null);
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String delete(){

        if(service.deleteInventory(inventory)){
            map.put("msg","1");
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }
    public String update(){

        if(service.updateInventory(inventory)){
            map.put("msg","1");
        }else{
            map.put("msg","0");
        }
        return SUCCESS;
    }

    @Override
    public Inventory getModel() {
        return inventory;
    }
}

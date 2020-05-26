package cn.itcast.Controller;

import cn.itcast.Entity.Employees;
import cn.itcast.Service.IstaffService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class staffController extends ActionSupport implements ModelDriven {
    @Autowired
    Employees employees;



    @Override
    public Object getModel() {
        return null;
    }

    @Autowired
    private IstaffService service;

    public IstaffService getService() {
        return service;
    }

    public void setService(IstaffService service) {
        this.service = service;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }



    HttpServletResponse response;//ServletAPI完成ajax
    PrintWriter out;
    //添加
    public String add() throws SQLException, IOException {
       response= ServletActionContext.getResponse();
        out=response.getWriter();
        boolean b=service.add(employees);
        if(b){

            out.print("1");
            out.flush();

        }else{

            out.print("2");
            out.flush();
        }
        return SUCCESS;
    }

    //修改
    public String upd() throws IOException, SQLException {
        response= ServletActionContext.getResponse();
        out=response.getWriter();
        boolean b=service.update(employees);
        if(b){

            out.print("1");
            out.flush();

        }else{

            out.print("2");
            out.flush();
        }
        return SUCCESS;
    }

    //删除
    public String del() throws IOException, SQLException {
        response= ServletActionContext.getResponse();
        out=response.getWriter();
        boolean b=service.delete(employees);
        if(b){

            out.print("1");
            out.flush();

        }else{

            out.print("2");
            out.flush();
        }
        return SUCCESS;
    }

    HttpServletRequest request;
    //查询
    public String Show() throws IOException {
        request=ServletActionContext.getRequest();
        response= ServletActionContext.getResponse();
        out=response.getWriter();
        int page= Integer.parseInt(request.getParameter("page"));
        int  no= Integer.parseInt(request.getParameter("limit"));
        if(request.getParameter("wai")!=null&&request.getParameter("wai").length()>0){

            int  wai=employees.getPostionId();



            Object   m = null;
            try {

                if(wai==-1){
                    m = service.selectAll(new Employees(),page,no);
                }else{
                    m = service.selectAll(new Employees(wai),page,no);
                }

                System.out.println(m);
                out.print(m);
                out.flush();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }





        // System.out.println(page+" "+no);


        try {
            System.out.println(" "+page+" "+no);
            Object   m = service.selectAll(new Employees(),page,no);

            out.print(m);

            out.flush();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return SUCCESS;
    }

}

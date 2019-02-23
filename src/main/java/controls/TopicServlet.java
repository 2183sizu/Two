package controls;

import accpa.extity.Topic;
import accpa.service.Impl.TopicServiceImpl;
import accpa.service.TopicService;
import accpa.util.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
@WebServlet(name = "TopicServlet",urlPatterns = "/topic")
public class TopicServlet extends HttpServlet {
    TopicService topicService=new TopicServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
       String t=request.getParameter("type");
       switch (t){
           case "add":
               //增加
               add(request,response);
               break;
           case "select":
               //查看类型
               select(request,response);

               break;
           case "up":
               //修改前的查询
               up(request,response);
             break;
           case "update":
               //修改内容
                    update(request,response);
               break;
           case "de":
               //删除前的查询
               up(request,response);
               break;
           case "delete":
               //删除
                delete(request,response);
               break;
           case "count":
               count(request,response);
               break;

       }

    }
    //删除
    public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id=request.getParameter("id");
        if(id!=null){
            //调用删除代码
            int num=topicService.delete(Integer.valueOf(id));
            if(num!=1){
                response.sendRedirect("Zengjiashibai.jsp");
            }else{
                response.sendRedirect("topic?type=select");
            }
         }

    }
    //查询条数
    public void count (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        int c=topicService.count();
       request.getSession().setAttribute("count",c);
       //当前页码
       String pageindex=request.getParameter("pageIndex");
       //如果为空，说明是第一次访问，默认给1
        if(pageindex==null){
            pageindex="1";
        }
       int ye=Integer.valueOf(pageindex);
        Page page=new Page();
        page.setCurrPageNo(ye);//当前页码
        page.setPageSize(5);    //
        topicService.findPageTopic(page);
        request.getSession().setAttribute("p",page);
        response.sendRedirect("Fenye.jsp");




    }
    //查询类型
    public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Topic> list=topicService.selecrAll();
        request.getSession().setAttribute("li",list);
        response.sendRedirect("Topic.jsp");
    }
    //增加
   public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        String tname=request.getParameter("tname");
        Topic topic=new Topic();
        topic.setTname(tname);
        int num=topicService.add(topic);
        if(num!=1){
            response.sendRedirect("Zengjiashibai.jsp");
        }else{
            response.sendRedirect("topic?type=select");
        }
    }
    //修改
    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String  id=request.getParameter("id");
        String  name=request.getParameter("tname");
        //调用修改代码
        Topic topic=new Topic();
        topic.setTid(Integer.valueOf(id));
        topic.setTname(name);
        int x=topicService.update(topic);
        //判断
        if(x!=1){
            response.sendRedirect("Zengjiashibai.jsp");
        }else{
            //成功后跳转查询页面
            response.sendRedirect("topic?type=select");
        }





    }
    //修改前的查询
    public void up (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        //得到编号
        String id=request.getParameter("id");
        //根据编号查询得到信息
        Topic topic=topicService.selectid(Integer.valueOf(id));
        //把信息储存到对象中session
        request.getSession().setAttribute("t",topic);
        //重定向到修改界面
        response.sendRedirect("update.jsp");





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

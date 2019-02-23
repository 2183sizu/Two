package controls;

import accpa.extity.News;
import accpa.extity.Topic;
import accpa.service.Impl.NewsServiceImpl;
import accpa.service.Impl.TopicServiceImpl;
import accpa.service.NewsService;
import accpa.service.TopicService;

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
@WebServlet(name = "SelectNewsServlet" ,urlPatterns = "/selectNews")
public class SelectNewsServlet extends HttpServlet {
    NewsService newsService=new NewsServiceImpl();
    TopicService topicService=new TopicServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String t=request.getParameter("type");
        switch (t){
             case "select":
                //查看类型
                select(request,response);
                break;
            case "delete":
                //删除
                delete(request,response);
                break;
            case "selbytid":
                selbytid(request,response);
                    break;
             }


     }
     public void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //查询新闻
         List<News> list=newsService.selectAll();
         //把查询的新闻存储到session
         request.getSession().setAttribute("li",list);
         //查询类别
         List<Topic> topicList=topicService.selecrAll();
         //把类别集合储存到session对象中
         request.getSession().setAttribute("tt",topicList);
            response.sendRedirect("News.jsp");
     }
     public void selbytid (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String tid=request.getParameter("topicinfo");
         System.out.println(tid);
        if(tid!=null) {

            List<News> list = newsService.selectNewsbytid(Integer.valueOf(tid));
            request.getSession().setAttribute("li", list);
            response.sendRedirect("News.jsp");
        }

 }
     public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         String id=request.getParameter("id");
         if(id!=null){
             System.out.println(id);
             //调用删除代码
             int num=newsService.delete(Integer.valueOf(id));
             if(num!=1){
                 response.sendRedirect("Zengjiashibai.jsp");
             }else{
                 response.sendRedirect("selectNews?type=select");
             }
         }

     }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

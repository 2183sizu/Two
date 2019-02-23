package controls;

import accpa.extity.Topic;
import accpa.service.Impl.TopicServiceImpl;
import accpa.service.TopicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
@WebServlet(name = "AddServlet" ,urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        TopicService topicService=new TopicServiceImpl();
        String tname=request.getParameter("tname");
         Topic topic=new Topic();
        topic.setTname(tname);

        int num=topicService.add(topic);
        if(num!=1){
            response.sendRedirect("Zengjiashibai.jsp");
        }else{
        response.sendRedirect("Zengjiachenggong.jsp");
        }
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

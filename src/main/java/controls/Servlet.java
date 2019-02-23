package controls;

import accpa.extity.News_users;
import accpa.service.Impl.UserServiceImpl;
import accpa.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by 钟家龙 on 2018-12-06.
 */
@WebServlet(name = "Servlet",urlPatterns = "/a")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String pwd=request.getParameter("pwd");

        News_users users=new News_users();
        users.setUname(username);
        users.setUpwd(pwd);

        UserService usersService=new UserServiceImpl();
        users=usersService.login(users);
        if(users.getUid()==null){
          request.setAttribute("message", "登录失败");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }else{
            response.sendRedirect("Welcome.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}



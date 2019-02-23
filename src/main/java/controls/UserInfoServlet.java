package controls;

import accpa.extity.UserInfo;
import accpa.service.Impl.UserInfoServiceImpl;
import accpa.service.UserInfoServic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
@WebServlet(name = "UserInfoServlet",urlPatterns = "/userinfo")
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String t=request.getParameter("action");
        switch (t){
            case "login":
            login(request,response);
                break;

        }


    }
    public void login (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        UserInfo userInfo=new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);

        UserInfoServic userInfoServic=new UserInfoServiceImpl();

        if(userInfoServic.login(userInfo)){

            request.getSession().setAttribute("user",userInfo);
            response.sendRedirect("list.jsp");
        }else{
            response.sendRedirect("Index.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}

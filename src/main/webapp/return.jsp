<%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-15
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学士后 在线短信平台</title>
    <link type="text/css" rel="stylesheet" href="css/sms.css" />
    <script type="text/javascript" src="scripts/jquery.js"></script>
</head>
<body>
<form action="MsgServlet?action=send" method="post" onsubmit="return check()">
    <div id="main">
        <div class="mainbox">
            <div class="menu">
                <span>当前用户：<a href="main.jsp">admin</a></span>
                <span><a href="UserServlet?action=findUsers">发短消息</a></span>
                <span><a href="UserServlet?action=logout">退出</a></span>
            </div>
            <div class="content">
                <div class="message">

                    <div class="tmenu">
                        <ul class="clearfix">
                            <li>
                                发送给：
                                <select name="toUser">


                                    <option selected="selected">abc</option>





                                    <option>bai</option>




                                    <option>abcd</option>


                                </select>
                            </li>
                            <li>标题：<input type="text" name="title" id="title"/></li>
                        </ul>
                    </div>
                    <div class="view">
                        <textarea name="content" id="content"></textarea>
                        <div class="send"><input type="submit" name="submit" value=" " /></div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>

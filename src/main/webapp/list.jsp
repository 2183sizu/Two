<%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-15
  Time: 9:08
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
<div id="main">
    <div class="mainbox">
        <div class="title myMessage png"></div>
        <div class="menu">
            <span>当前用户：<a href="main.jsp">admin</a></span>
            <span><a href="UserServlet?action=findUsers">发短消息</a></span>
            <span><a href="UserServlet?action=logout">退出</a></span>
        </div>
        <div id="error"></div>
        <div class="content messageList">
            <ul>



                <li>

                    <em>2013-06-13</em>
                    <em><a href=UserServlet?action=findUsers&sendto=abc&state=1>回信</a></em>
                    <em><a href=MsgServlet?action=del&msgid=1497650307>删除</a></em>
                    <p>
                        <strong><a href=MsgServlet?action=read&msgid=1497650307&state=1>abc</a></strong>


                        abc

                    </p>



                <li>

                    <em>2013-06-13</em>
                    <em><a href=UserServlet?action=findUsers&sendto=abc&state=1>回信</a></em>
                    <em><a href=MsgServlet?action=del&msgid=1811743429>删除</a></em>
                    <p>
                        <strong><a href=MsgServlet?action=read&msgid=1811743429&state=1>abc</a></strong>


                        abc

                    </p>

            </ul>
        </div>
    </div>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-15
  Time: 9:12
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
        <div class="title readMessage png"></div>
        <div class="menu">
            <span>当前用户：<a href="main.jsp">admin</a></span>
            <span><a href="UserServlet?action=findUsers">发短消息</a></span>
            <span><a href="UserServlet?action=logout">退出</a></span>
        </div>
        <div class="content">
            <div class="message">

                <div class="tmenu">
                    <ul class="clearfix">
                        <li>题目：abc </li>
                        <li>来自：admin</li>
                        <li>时间：2013-06-13</li>
                    </ul>
                </div>
                <div class="view">
                    <p>abc</p>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>

<%@ page import="accpa.extity.Topic" %><%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-11
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="topic" method="post">
    <input type="hidden" name="type" value="update"/>
    <input type="hidden" name="id" value="${t.tid}"/>
     编号<label>${t.tid}</label>
    名称<input type="text" name="tname" value="${t.tname}"/>
    <input type="submit" value="修改"/>

</form>


<%--
<%
    Topic topic=(Topic)session.getAttribute("t");

%>
<form action="topic" method="post">
    <input type="hidden" name="type" value="update"/>
    <input type="hidden" name="id" value="<%=topic.getTid()%>"/>
    编号<label><%=topic.getTid()%></label>
    名称<input type="text" name="tname" value="<%=topic.getTname()%>"/>
    <input type="submit" value="修改"/>

</form>--%>
</body>
</html>

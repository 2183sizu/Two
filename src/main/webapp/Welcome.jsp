<%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-08
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

确认过眼神，遇上对的人
<form action="topic" method="post">
    <input type="hidden" name="type" value="add">
    要增加的类型:<input type="text" name="tname"/>
    <input type="submit" value="增加"/>

</form>
<form action="topic" method="post">
    <input type="hidden" name="type" value="select">
    <input type="submit" value="查询类别"/>

</form>
<form action="selectNews" method="post">
    <input type="hidden" name="type" value="select">
    <input type="submit" value="查询新闻"/>

</form>
<form action="topic" method="post">
    <input type="hidden" name="type" value="count">
    <input type="submit" value="分页"/>
</form>
</body>
</html>

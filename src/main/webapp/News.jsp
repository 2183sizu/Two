<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="accpa.extity.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-10
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="selectNews" method="post">
        <input type="hidden" name="type" value="selbytid"/>
        <select style="width: 200px" name="topicinfo" onlink="setcookie('xiala',selected)>
            <c:forEach items="${tt}" var="t">
                <option value="${t.tid}">${t.tname}</option>
            </c:forEach>
        </select>
        <input type="submit" value="查询"/>
     </form>
<table border="1" width="700" >
    <tr>
        <th width="40">新闻编号</th>
        <th width="40">新闻类型</th>
        <th width="10">新闻作者</th>
        <th width="20">新闻标题</th>
        <th width="60">新闻内容</th>
        <th width="60">操作</th>
    </tr>
        <c:forEach items="${li}" var="news">
    <tr>
        <td>${news.nid}</td>
        <td>${news.topic.tname}</td>
        <td>${news.nauthor}</td>
        <td>${news.ntitle}</td>
        <td>${news.nsummary}</td>
        <td>
            <a href="">修改</a>
            <a href="selectNews?type=delete&id=${news.nid}">删除</a>
        </td>
    </tr>
        </c:forEach>
    <%--<c:if test="${}">selected</c:if>--%>

</table>
</body>
</html>

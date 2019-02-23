<%@ page import="accpa.extity.Topic" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 钟家龙
  Date: 2018-12-08
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=session.getAttribute("count")%>条数据


<table border="1" >
    <tr>
        <th width="50">编号</th>
        <th width="80">名称</th>
        <th width="150">操作</th>

    </tr>
    <c:forEach items="${p.topicList}" var="topic" >
        <tr <c:if test="${s.index%2==1}">
            style="background-color: aqua"
        </c:if>
                <c:if test="${s.index%2==0}">
                    style="background-color: cornsilk"
                </c:if>
        >
            <td style="color:blue">${topic.tid}</td>
            <td style="color:red">${topic.tname}</td>
            <td>
                <a href="topic?type=up&id=${topic.tid}">修改</a>
                <a href="topic?type=delete&id=${topic.tid}">删除</a>
            </td>
        </tr>
    </c:forEach>
       <tr>
           <td colspan="2">
               <a href="topic?type=count&pageIndex=1">首页</a>
               <c:if test="${p.currPageNo>1}">
                   <a href="topic?type=count&pageIndex=${p.currPageNo-1}">上一页</a>
               </c:if>
                <c:if test="${p.currPageNo<p.totalPageCount}">
                    <a href="topic?type=count&pageIndex=${p.currPageNo+1}">下一页</a>
                </c:if>
               <a href="topic?type=count&pageIndex=${p.totalPageCount}">尾页</a>
           </td>

       </tr>

</table>




</body>
</html>

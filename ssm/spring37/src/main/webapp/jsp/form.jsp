<%--
  Created by IntelliJ IDEA.
  User: Yazan
  Date: 2021/5/1
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/getParm/quick14" method="post">
<%--userList是vo对象的属性，但是他又是个集合--%>
    <%--表明是第一个User对象的name,age--%>
    <input type="text" name="userList[0].username"><br>
    <input type="text" name="userList[0].age"><br>
<%--表明是第二个User对象的name,age--%>
    <input type="text" name="userList[1].username"><br>
    <input type="text" name="userList[1].age"><br>
    <input type="submit" value="提交"><br></form>


</body>
</html>

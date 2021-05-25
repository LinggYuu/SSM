<%--
  Created by IntelliJ IDEA.
  User: Yazan
  Date: 2021/5/25
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--http://localhost:8080/jsp/upload.jsp--%>
<body>
    <form action="${pageContext.request.contextPath}/quick22"method="post"enctype="multipart/form-data">
<%--        enctype如果是url编码方式则默认都是键值对形式，key=value。现在文件上传必须是多部份表单形式--%>
        名称<input type="text" name="username"><br/>
        文件<input type="file" name="uploadFile"><br/>
        <input type="submit"value="提交">

    </form>
</body>
</html>

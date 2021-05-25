<%--
  Created by IntelliJ IDEA.
  User: Yazan
  Date: 2021/5/25
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/quick23"method="post"enctype="multipart/form-data">--%>
<%--    &lt;%&ndash;        enctype如果是url编码方式则默认都是键值对形式，key=value。现在文件上传必须是多部份表单形式&ndash;%&gt;--%>
<%--    名称<input type="text" name="username"><br/>--%>
<%--    文件1<input type="file" name="uploadFile1"><br/>--%>
<%--    文件2<input type="file" name="uploadFile2"><br/>--%>
<%--    <input type="submit"value="提交">--%>
<%--</form>--%>

<form action="${pageContext.request.contextPath}/quick23"method="post"enctype="multipart/form-data">
    <%--        enctype如果是url编码方式则默认都是键值对形式，key=value。现在文件上传必须是多部份表单形式--%>
    名称<input type="text" name="username"><br/>
    文件1<input type="file" name="uploadFiles"><br/>
    文件2<input type="file" name="uploadFiles"><br/>
    <input type="submit"value="提交">
</form>

</body>
</html>

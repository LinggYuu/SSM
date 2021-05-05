<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--要发ajax请求用原生的js也没问题但一般情况下发生ajax请求都用jquery--%>
    <%--引入jquery--%>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        <%--var一个数组--%>
        var userList =new Array();
        userList.push({username:"ling",age:18});
        userList.push({username:"yu",age:22});

        //发送ajax请求
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/getParm/quick15",
            //把上面的转成json格式
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });
    </script>

</head>
<body>



</body>
</html>

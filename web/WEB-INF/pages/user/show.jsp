<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        $(function () {
            $("#exit").click(function () {
                var flag = confirm("是否退出？")
                if(flag){

                }else {
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <a href="#">反馈</a>
    <a href="${pageContext.request.contextPath}/user/lookResume?id=${requestScope.user.id}">查看简历</a>
    <a href="${pageContext.request.contextPath}/user/updatePassword?id=${requestScope.user.id}">修改密码</a>
    <a href="#">其他</a>
    <a href="${pageContext.request.contextPath}/user/exit" id="exit">退出</a>
</body>
</html>

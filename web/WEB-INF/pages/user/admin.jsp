<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script src="bootstrap/js/bootstrap.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
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
    <a href="${pageContext.request.contextPath}/user/showResumes">应聘管理</a>
    <a>部门职位</a>
    <a>培训管理</a>
    <a>员工管理</a>
    <a>奖惩管理</a>
    <a>薪资管理</a>
    <a>工资异议</a>
    <a href="${pageContext.request.contextPath}/user/exit" id="exit">退出</a>
</body>
</html>

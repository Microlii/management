<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
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
    <a href="#">上班签到</a><br>
    <a href="#">下班签到</a><br>
    <a href="#">个人信息</a><br>
    <a href="#">我的考勤</a><br>
    <a href="#">修改密码</a><br>
    <a href="#">我的奖惩</a><br>
    <a href="#">部门职位</a><br>
    <a href="#">其他</a><br>
    <a href="#">我的薪资</a><br>
    <a href="#" id="exit">退出</a>
</body>
</html>

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
            var date =$("#date").val()
                $("#a1").click(function () {
                    if(date==2){
                        return false;
                    }
                    if(date==1){
                        return false;
                    }
                })
            $("#a2").click(function () {
                if(date==2){
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <input type="hidden" value="${requestScope.date}" id="date">
    <a href="${pageContext.request.contextPath}/user/addPunch?id=${requestScope.user.id}" id="a1">上班签到</a><br>
    <a href="${pageContext.request.contextPath}/user/addOfTime?id=${requestScope.user.id}" id="a2">下班签到</a><br>
    <button><a href="${pageContext.request.contextPath}/user/showInformation?id=${requestScope.user.id}">个人信息</a></button><br>
    <button><a href="#">我的考勤</a><br></button>
    <button><a href="#">修改密码</a><br></button>
    <button><a href="#">我的奖惩</a><br></button>
    <button><a href="#">部门职位</a><br></button>
    <button><a href="#">其他</a><br></button>
    <button><a href="#">我的薪资</a><br></button>
    <button><a href="#" id="exit">退出</a></button>
</body>
</html>

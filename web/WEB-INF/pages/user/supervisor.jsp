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
            var s = $("#hid").val();
            if(s!=""){
                alert("你有新的面试通知请注意查看")
            }
            $("#interview").click(function () {
                var s = $("#hid").val();
                if(s==""){
                    alert("暂时没有新的应聘信息")
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <input type="hidden" value="${requestScope.id}" id="hid">
    <a href="${pageContext.request.contextPath}/user/interviews?id=${requestScope.id}" id="interview">面试管理</a><br>
    <a href="#">培训管理</a><br>
    <a href="#">绩效管理</a><br>
    <a href="${pageContext.request.contextPath}/user/exit" id="exit">退出</a><br>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            var oldPassword = $("#old").val()
            $("#old1").blur(function () {
                var old = $("#old1").val();
                if(old!=oldPassword){
                    alert("原始密码输入错误")
                }
            })
            $("#new").blur(function () {
                var news = $("#new").val();
                var old = $("#old1").val();
                if(news==""){
                    alert("新密码不能为空")
                }
                if(news==old){
                    alert("新密码和原始密码一样")
                }
            })
            $("#new1").blur(function () {
                var news = $("#new").val();
                var news1 = $("#new1").val();
                if(news!=news1){
                    alert("与新密码不一样")
                }
            })
            $("#check").click(function () {
                var old = $("#old1").val();
                if(old!=oldPassword){
                    alert("原始密码输入错误")
                    return false;
                }
            })
            $("#check").click(function () {
                var news = $("#new").val();
                var old = $("#old1").val();
                if(news==""){
                    alert("新密码不能为空")
                    return false;
                }
                if(news==old){
                    alert("新密码和原始密码一样")
                    return false;
                }
            })
            $("#check").click(function () {
                var news = $("#new").val();
                var news1 = $("#new1").val();
                if(news!=news1){
                    alert("与新密码不一样")
                    return false;
                }
            })
        })
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/updatedPassword?id=${requestScope.user.id}" method="post" }>
        <input type="hidden" value="${requestScope.user.password}" id="old">
        请输入原始密码<input type="password" name="oldPassword" id="old1"><br>
        请输入新密码<input type="password" name="newPassword" id="new"><br>
        请重复密码<input type="password" name="newPassword2" id="new1"><br>
        <button type="password" id="check">提交</button>
        <button type="reset">返回</button>
    </form>
</body>
</html>

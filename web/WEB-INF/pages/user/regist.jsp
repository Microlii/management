<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.7.2.js"></script>
    <script>
          $(function () {
              var str = $("#cck").val()
              if(str!=""){
                  alert("str")
              }
              $("#acc").blur(function () {
                  var acc = $("#acc").val();
                  if(acc==""){
                      alert("账号不能为空")
                  }
              })
              $("#p1").blur(function () {
                  var pw1 = $("#p1").val();
                  if(pw1==""){
                      alert("密码不能为空")
                  }
              })
              $("#p2").blur(function () {
                  var pw1 = $("#p1").val();
                  var pw2 = $("#p2").val();
                  if(pw1!=pw2){
                      alert("两次输入密码不一致")
                  }
              })
              $(function () {
                  $("#sub").click(function () {

                  })
              })
          })
      </script>
  </head>
  <body>
        <input type="hidden" value="${requestScope.str}" id="cck">
        <form action="${pageContext.request.contextPath}/user/logined">
            账号<input type="text" name="account" id="acc"><br>
            密码<input type="password" name="password" id="p1"><br>
            请重复密码<input type="password" name="password2" id="p2"><br>
            <input type="submit" id="sub">
        </form>
  </body>
</html>

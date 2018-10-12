<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.7.2.js"></script>
    <script>
          $(function () {
              $("#sub").click(function () {
                  var account = $ ("#acc").val();
                  var p1 = $("#p1").val();
                  var p2 = $("#p2").val();
                  if(account==""){
                      alert("账号不能为空")
                      return false;
                  }
                  if(p1==""){
                      alert(("密码不能为空"))
                      return false;
                  }
                  if(p2==""){
                      alert("请确认密码")
                      return false;
                  }
                  if(p1!=p2){
                      alert("两次输入密码不一致")
                      return false;
                  }
              })
          })
      </script>
  </head>
  <body>
        <form action="${pageContext.request.contextPath}/user/logined">
            账号<input type="text" name="account" id="acc"><br>
            密码<input type="password" name="password" id="p1"><br>
            请重复密码<input type="password" name="password" id="p2"><br>
            <input type="submit" id="sub">
        </form>
  </body>
</html>

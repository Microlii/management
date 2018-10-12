<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<%--<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">--%>
<%--<script src="bootstrap/js/bootstrap.min.js"></script>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<html>
  <head>
    <title>登陆&注册</title>
  </head>
  <body>
        <form action="user/login" method="post">
            账号<input type="text" name="account"><br>
            密码<input type="password" name="password"><br>
            <c:if test="${requestScope.str}==null">
                账号密码错误
            </c:if>
            <input type="submit"><br>
            <a href="user/registing">注册</a>
        </form>
  </body>
</html>

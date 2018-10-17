<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            alert(${requestScope.interview.interviewTime})
        })
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/updateInterview?id=${requestScope.interview.uId}" method="post">
    <table cellspacing="2px" cellpadding="2px" border="2px">
        <tr>
            <td>面试</td>
            <td>部门</td>
            <td>职位</td>
            <td>时间</td>
            <td>是否录用</td>
        </tr>
        <tr>
            <td>${requestScope.interview.uId}</td>
            <td>${requestScope.interview.dept}</td>
            <td>${requestScope.interview.job}</td>
            <td id="time">${requestScope.interview.interviewTime}</td>
            <td>${requestScope.interview.hire}</td>
        </tr>
        <button type="submit">去面试</button>  <button><a href="#">不参加</a></button>
    </table>
</form>
</body>
</html>

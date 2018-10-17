<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form>
        <table cellpadding="2px" cellspacing="2px" border="2px">
            <tr>
                <td>序号</td>
                <td>应聘者</td>
                <td>面试时间</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.interviews}" var="interveiw">
                <tr>
                    <td>${interveiw.id}</td>
                    <td>${interveiw.uId}</td>
                    <td>${interveiw.interviewTime}</td>
                    <td><a href="${pageContext.request.contextPath}/user/showdetails?id=${interveiw.rId}">面试</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>

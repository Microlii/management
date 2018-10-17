<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看简历</title>
    <script>

    </script>
</head>
<body>
        <table cellspacing="2px" cellpadding="2px" border="10px">
            <tr>
                <td>序号</td>
                <td>应聘者</td>
                <td>投递时间</td>
                <td>查看状态</td>
                <td>面试状态</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.resumes}" var="resume">
                <tr>
                    <td>序号</td>
                    <td>${resume.id}</td>
                    <td>${resume.deliveryTime}</td>
                    <td>${resume.look}</td>
                    <td>${resume.invite}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/user/look?id=${resume.id}">查看</a>
                        <a href="#" class="delete">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>

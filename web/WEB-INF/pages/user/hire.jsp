<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <script>
        $(function () {
            $("#sub").click(function () {
                var flag = confirm("确定要录取？")
                if(flag){

                }else {
                    return false;
                }
            })
            $("#delete").click(function () {
                var flag = confirm("确定要录取？")
                if(flag){

                }else {
                    return false;
                }
            })
        })
    </script>
</head>
<body>
        <form action="${pageContext.request.contextPath}/user/hire?id=${requestScope.resume.id}" method="post">
            <table cellpadding="2px" cellspacing="2px" border="2px">
                <tr>
                    <td>姓名</td>
                    <td>${requestScope.resume.name}</td>
                    <td>年龄</td>
                    <td>${requestScope.resume.age}</td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>${requestScope.resume.sex}</td>
                    <td>学历</td>
                    <td>${requestScope.resume.eduction}</td>
                </tr>
                <tr>
                    <td>手机</td>
                    <td>${requestScope.resume.tel}</td>
                    <td>邮箱</td>
                    <td>${requestScope.resume.email}</td>
                </tr>
                <tr>
                    <td>应聘职位</td>
                    <td>${requestScope.resume.dept}、${requestScope.resume.job}</td>
                    <td>政治面貌</td>
                    <td>${requestScope.resume.status}</td>
                </tr>
                <tr>
                    <td>专业</td>
                    <td>${requestScope.resume.profession}</td>
                    <td>爱好</td>
                    <td>${requestScope.resume.hobby}</td>
                </tr>
                <tr>
                    <td>工资要求</td>
                    <td>${requestScope.resume.expectSalary}</td>
                </tr>
            </table>
                <button type="submit" id="sub">录取</button>
                <button><a href="${pageContext.request.contextPath}/user/delete" id="delete">不录取</a></button>
        </form>
</body>
</html>

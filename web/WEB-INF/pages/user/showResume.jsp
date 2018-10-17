<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <script>
        $(function () {
            $("#sub").click(function () {
                var t = $("#time").val()
                if(t==""){
                    alert("请输入面试时间")
                    return false;
                }
            })
        })
    </script>
</head>
<body>
        <form action="${pageContext.request.contextPath}/user/addInterview?id=${requestScope.resume.id}" method="post">
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
                    <td>面试时间</td>
                    <td><input type="date" name="time" id="time"></td>
                </tr>
            </table>
                <button type="submit" id="sub">面试</button>
                <a href="${pageContext.request.contextPath}/user/showResumes">返回</a>
        </form>
</body>
</html>

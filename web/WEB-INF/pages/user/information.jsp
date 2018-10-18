<%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form>
            <table cellspacing="2px" cellpadding="2px" border="2px">
                <tr>
                    <td>姓名</td>
                    <td><input type="text" value="${requestScope.information.name}"></td>
                    <td>性别</td>
                    <td>
                        ${requestScope.information.sex eq '男'?'<input type="radio" name="sex" value="男" checked="checked"/>男':'<input type="radio" name="sex" value="男"/>男'}
                        ${requestScope.information.sex eq '女'?'<input type="radio" name="sex" value="女" checked="checked"/>女':'<input type="radio" name="sex" value="女"/>女'}
                    </td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input type="text" value="${requestScope.information.age}"></td>
                    <td>学历</td>
                    <td><input type="text" value="${requestScope.information.eduction}"></td>
                </tr>
                <tr>
                    <td>手机号码</td>
                    <td><input type="text" value="${requestScope.information.tel}"></td>
                    <td>邮箱</td>
                    <td><input type="email" value="${requestScope.information.email}"></td>
                </tr>
                <tr>
                    <td>部门</td>
                    <td><input type="text" value="${requestScope.information.dept}" disabled="true"></td>
                    <td>岗位</td>
                    <td><input type="text" value="${requestScope.information.job}" disabled="true"></td>
                </tr>
                <tr>
                    <td>政治面貌</td>
                    <td><input type="text" value="${requestScope.information.status}"></td>
                    <td>入职时间</td>
                    <td><input type="text" value="${requestScope.information.entryTime}" disabled="true"></td>
                </tr>
            </table>
        </form>
</body>
</html>

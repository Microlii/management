<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script></script>
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            $("#first").blur(function(){
                var dept = $(this).val();//得到第一个下拉列表的值
                $(".job").empty()
                var html=""
                $.ajax({
                    url:"${pageContext.request.contextPath}/user/findJobs",
                    type:"POST",
                    dataType:"json",
                    data:{"name":dept},
                    success:function(data){
                        $.each(data,function(idx,item){
                            html+="<option>"+item.name+"</option>"
                        });
                        $(html).appendTo($(".job"))
                    }
                })
            })
            $("#sub").click(function () {
                var name = $("#name").val()
                var age = $("#age").val()
                var ediction = $("#eduction").val()
                var tel = $("#tel").val()
                var status = $("#status").val()
                var profession = $("#profession").val()
                var expectSalary = $("#expectSalary").val()
                var hobby = $("#hobby").val()
                if(name==""){
                    alert("姓名不能为空")
                    return false
                }
                if(age==""){
                    alert("age不能为空")
                    return false
                }
                if(ediction==""){
                    alert("学历不能为空")
                    return false
                }
                if(tel==""){
                    alert("电话不能为空")
                    return false
                }
                if(status==""){
                    alert("政治面貌不能为空")
                    return false
                }
                if(profession==""){
                    alert("profession不能为空")
                    return false
                }
                if(expectSalary==""){
                    alert("薪资不能为空")
                    return false
                }
                if(hobby==""){
                    alert("爱好不能为空")
                    return false
                }
            })
        })
    </script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/addResume?id=${requestScope.user.id}" method="post" name="resume">
        <table cellpadding="2px" cellspacing="2px" border="2px">
            <tr>
                <td colspan="2">简历</td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="${requestScope.resume.name}" id="name"></td>
                <td>性别</td>
                <td>
                    ${requestScope.resume.sex eq '男'?'<input type="radio" name="sex" value="男" checked="checked"/>男':'<input type="radio" name="sex" value="男"/>男'}
                    ${requestScope.resume.sex eq '女'?'<input type="radio" name="sex" value="女" checked="checked"/>女':'<input type="radio" name="sex" value="女"/>女'}
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="number" name="age" value="${requestScope.resume.age}" id="age"></td>
                <td>学历</td>
                <td><select name="eduction" id="eduction">
                    <option>学历</option>
                    <option <c:if test="${requestScope.resume.eduction == '博士'}">selected="selected"</c:if>>博士</option>
                    <option <c:if test="${requestScope.resume.eduction == '硕士'}">selected="selected"</c:if>>硕士</option>
                    <option <c:if test="${requestScope.resume.eduction == '本科'}">selected="selected"</c:if>>本科</option>
                    <option <c:if test="${requestScope.resume.eduction == '大专'}">selected="selected"</c:if>>大专</option>
                    <option <c:if test="${requestScope.resume.eduction == '高中'}">selected="selected"</c:if>>高中</option>
                </select>
                </td>
            </tr>
            <tr>
                <td>手机号码</td>
                <td><input type="number" name="tel" value="${requestScope.resume.tel}" id="tel"></td>
                <td>email</td>
                <td><input type="email" name="email" value="${requestScope.resume.email}"></td>
            </tr>
            <tr>
                <td>应聘职位</td>
                <td><select name="dept" id="first">
                    <c:forEach items="${requestScope.depts}" var="dept">
                        <c:if test="${requestScope.resume.dept==dept.name}">
                            <option selected="selected">${requestScope.resume.dept}</option>
                        </c:if>
                        <c:if test="${requestScope.resume.dept!=dept.name}">
                            <option>${dept.name}</option>
                        </c:if>
                    </c:forEach>
                </select>
                    <select  id="second" name="job" class="job">
                        <c:forEach items="${requestScope.jobs}" var="job">
                            <c:if test="${requestScope.resume.job==job.name}">
                                <option >${requestScope.resume.job}</option>
                            </c:if>
                        </c:forEach>
                        <c:if test="${empty requestScope.resume}">
                            <c:forEach items="${requestScope.jobs}" var="job">
                                <c:if test="${job.id==1}">
                                    <option>${job.name}</option>
                                </c:if>
                            </c:forEach>
                        </c:if>
                    </select>
                </td>
                <td>政治面貌</td>
                <td><select name="status" id="status">
                    <option <c:if test="${requestScope.resume.status == '普通群众'}">selected="selected"</c:if>>普通群众 </option>
                    <option <c:if test="${requestScope.resume.status == '共青团员'}">selected="selected"</c:if>>共青团员</option>
                    <option <c:if test="${requestScope.resume.status == '党员'}">selected="selected"</c:if>>党员</option>
                </select></td>
            </tr>
            <tr>
                <td>专业</td>
                <td><input type="text" name="profession" value="${requestScope.resume.profession}" id="profession"></td>
                <td>爱好</td>
                <td><input type="text" name="hobby" value="${requestScope.resume.hobby}" id="hobby"></td>
            </tr>
            <tr>
                <td>工资要求</td>
                <td>
                    <select name="expectSalary" id="expectSalary">
                        <option <c:if test="${requestScope.resume.expectSalary == '3000-4000'}">selected="selected"</c:if>>3000-4000</option>
                        <option <c:if test="${requestScope.resume.expectSalary == '4000-6000'}">selected="selected"</c:if>>4000-6000</option>
                        <option <c:if test="${requestScope.resume.expectSalary == '6000-8000'}">selected="selected"</c:if>>6000-8000</option>
                        <option <c:if test="${requestScope.resume.expectSalary == '8000-10000'}">selected="selected"</c:if>>8000-10000</option>
                        <option <c:if test="${requestScope.resume.expectSalary == '10000-15000'}">selected="selected"</c:if>>10000-15000</option>
                        <option <c:if test="${requestScope.resume.expectSalary == '15000以上'}">selected="selected"</c:if>>15000以上</option>
                    </select>
                </td>
                <input type="hidden" name="flag" id="submit">
                <td>投递简历</td>
                <td>
                    <input type="radio" name="deli" value="是">是
                    <input type="radio" name="deli" value="否">否
                </td>
            </tr>
            <tr>
                <td colspan="2"><button type="submit" id="sub">保存</button></td>
                <td colspan="2"><button type="reset">返回</button></td>
            </tr>
        </table>
    </form>
</body>
</html>

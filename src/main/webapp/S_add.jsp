<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/8
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<s:form action="add" method="get" name = "myform" validate="true">
    <s:textfield placeholder="姓名" name = "name"/>
<%--    <h3 style="color: red"><s:fielderror fieldName="name"></s:fielderror></h3><br>--%>
    <s:password placeholder="密码" name = "password"/>
<%--    <h3 style="color: red"><s:fielderror fieldName="password"></s:fielderror></h3><br>--%>
    <s:textfield placeholder="生日" name = "birthday" /><br>
    <s:textfield placeholder=" 性别" name = "sex" /><br>
    <s:textfield placeholder="学校" name = "university" /><br>
    <s:textfield placeholder="学院" name = "department" /><br>
    <s:textfield placeholder="年级" name = "grade" /><br>
    <s:textfield placeholder="专业" name = "major" /><br>
    <s:submit  value = "添加"/>
</s:form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/14
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生登录</title>
</head>
<body>
<h1>基于struts2+Hibernate的学生管理系统</h1>
<h3>学生登录</h3>
<s:form action = "studentLogin" method="get">
    <s:textfield name="name" label="姓名" size="16"/>
    <s:password name="password" label="密码" size="16"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>

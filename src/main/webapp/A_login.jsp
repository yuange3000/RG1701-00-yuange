<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/8
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<h1><a href="hello">hello</a></h1>
<h1>基于struts2+Hibernate的学生管理系统</h1>
<h3>管理员登录</h3>
<s:form action = "adminLogin" method="get">
    <s:textfield name="admin_name" label="姓名" size="16"/>
    <s:password name="admin_password" label="密码" size="16"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/14
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生成绩</title>
</head>
<body>
<table border = "1" cellspacing="0" align="center">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>数学</td>
        <td>英语</td>
        <td>物理</td>
        <td>javaweb</td>
    </tr>
<s:iterator value="achieveList">
    <tr>
        <td><s:property value="student_sid"/> </td>
        <td><s:property value="student_name"/></td>
        <td><s:property value="math"/></td>
        <td><s:property value="english"/></td>
        <td><s:property value="physics"/></td>
        <td><s:property value="javaweb"/></td>
    </tr>
</s:iterator>
</table>
<s:debug/>
</body>
</html>

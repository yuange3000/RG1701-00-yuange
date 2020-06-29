<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/14
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生页面</title>
</head>
<body>
<s:property value="#session.student_name"/>:
<table border = "1" cellspacing="0" align="center">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>出生日期</td>
        <td>性别</td>
        <td>大学</td>
        <td>院系</td>
        <td>年级</td>
        <td>专业</td>
        <td>修改</td>
        <td>查看成绩</td>
    </tr>
    <s:iterator value="stuList">
        <tr>
            <td><s:property value="sid"/> </td>
            <td><s:property value="name"/> </td>
            <td><s:property value="password"/> </td>
            <td><s:property value="birthday"/> </td>
            <td><s:property value="sex"/> </td>
            <td><s:property value="university"/> </td>
            <td><s:property value="department"/> </td>
            <td><s:property value="grade"/> </td>
            <td><s:property value="major"/> </td>
            <td><a href="S_update_self.jsp?sid=<s:property value="sid" />
            &name=<s:property value="name"/>
            &password=<s:property value="password"/>
            &birthday=<s:property value="birthday"/>
            &sex=<s:property value="sex"/>
            &university=<s:property value="university"/>
            &department=<s:property value="department"/>
            &grade=<s:property value="grade"/>
            &major=<s:property value="major"/>">修改</a> </td>
            <td><a href="student_achievement?sid=<s:property value="sid" />">查看成绩</a></td>
        </tr>
    </s:iterator>
</table>

</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2020/4/8
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生更新</title>
</head>
<body>
<form action="S_Update" method="get" name = "myform" >
   <input type="hidden" name="sid" value="<%=request.getParameter("sid")%>"><br>
    姓名：<input type="text" name="name" value="<%=request.getParameter("name")%>"><br>
    密码：<input type="text"  name = "password" value="<%=request.getParameter("password")%>"><br>
    生日：<input type="text" name = "birthday" value="<%=request.getParameter("birthday")%>"><br>
    性别：<input type="text" name = "sex" value="<%=request.getParameter("sex")%>"><br>
    学校：<input type="text" name = "university" value="<%=request.getParameter("university")%>"><br>
    学院：<input type="text" name = "department" value="<%=request.getParameter("department")%>"><br>
    年级：<input type="text" name = "grade" value="<%=request.getParameter("grade")%>"><br>
    专业：<input type="text" name = "major" value="<%=request.getParameter("major")%>"><br>
    <input type="submit"  value = "修改">

</form>
</body>
</html>

<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%EmployeeBean bean=(EmployeeBean)session.getAttribute("bean"); %>

<form action="./changepassword" method="post" style="margin-left: 450px;margin-top: 100px;">
ID:
<br><input type="text" name="id" value="<%=bean.getId()%>"><br>
Password:<br>
<input type="text" name="password">
<button type="submit">change</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="info" class="com.ust.webapp.dto.EmployeeInfo" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a style="float:right"; href='./logout'>LOGOUT</a>
<h1>Welcome <%=info.getName() %></h1>
<a href='./search.html'>SEARCH</a>
<a href='./ChangePassword.jsp'>CHANGE PASSWORD</a>

</body>
</html>
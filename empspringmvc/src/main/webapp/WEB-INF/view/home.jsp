
<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
EmployeeBean bean =(EmployeeBean)session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./update">Update Profile</a>
	<a href="delete">Delete Profile</a>
	<a href="logout">Logout</a>
	<h2>Welcome <%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
<%
EmployeeBean employeeBean = (EmployeeBean)request.getAttribute("bean");
%>
<%
if(employeeBean!=null){
%>
<table>
	<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Gender</th>
	<th>DOJ</th>
	</tr>
	<tr>
	<th><%=employeeBean.getName()%></th>
	<th><%=employeeBean.getEmail()%></th>
	<th><%=employeeBean.getGender()%></th>
	<th><%=employeeBean.getDoj()%></th>
	</tr>
</table>
<%
}
%>
<h3 style="color: red;">${msg}</h3>
</body>
</html>
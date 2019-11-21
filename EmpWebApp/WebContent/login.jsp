<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
%>
<body>
<h4><%=msg %></h4>
<fieldset align='center'>
		<legend>LOGIN</legend>
		<form action='./login' method='post'>
			<table align='center'>
				<tr>
					<td>ID:</td>
					<td><input name='id' type='number' value='<%=id %>'></td>
				</tr>
				<tr>
					<td>PASSWORD:</td>
					<td><input name='password' type='password'></td>
				</tr>
				<tr>
					<td></td>
					<td><input name='login' type='submit'></td>
				</tr>
				<tr>
					<td>REMEMBER</td>
					<td><input name='rememberme' type='checkbox' value='checked'></td>
				</tr>
			</table>
		</form>
		<a href='./register.html'>REGISTER</a>
	</fieldset>

</body>
</html>
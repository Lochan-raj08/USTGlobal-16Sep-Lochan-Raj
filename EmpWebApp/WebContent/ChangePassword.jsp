<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<a href="/home">HOME</a>
<h4><%=msg %></h4>
<a href="./logout" style="float: right;">LOGOUT</a>
	<fieldset align="center">
		<legend>CHANGE PASSWORD</legend>
		<form action="./ChangePassword" method="post">
			<table align="center">
				<tr>
					<td>NEW PASSWORD</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>CONFIRM PASSWORD</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="reset"></td>
					<td><input type="submit" name="changepassword"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
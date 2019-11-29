<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="post" style="margin-left: 450px;margin-top: 100px;">
Name:<br>
<input type="text" name="name"><br>
Gender:<br>
<select name="gender">
<option>select</option>
<option value="M">male</option>
<option value="F">female</option>
</select>
<br>
DOJ:<br>
<input type="date" name="doj">
<button type="submit">Update</button>
</form>
</body>
</html>
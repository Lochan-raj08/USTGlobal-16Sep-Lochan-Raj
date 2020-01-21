<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
</head>
<body>
<form action="./form" method="post" style="margin-left: 300px;margin-top: 100px;">
id:<br><input type = "text" name="id" placeholder="enter id"><br>
name:<br><input type = "text" name="name" placeholder="enter name"><br>
password:<br><input type="password" name="password" placeholder="Enter password"><br>
gender:<br><input type="text" name="gender" placeholder="Enter Gender"><br>
date:<br><input type="date" name="doj" ><br>
<button type="reset">Reset</button>
<button type="submit">Submit</button>
</form>
</body>
</html>
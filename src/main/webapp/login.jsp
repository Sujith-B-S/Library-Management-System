<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
	<h1>Admin Login</h1>
	<form action="Login">
		<input type = "email" name = "email" required="required" placeholder="Email"><br><br>
		<input type = "password" name = "pwd" required="required" placeholder="Password"><br><br>
		<input type = "submit" value = "Login"> 
	</form>
	<a href = "login.jsp"> <button>Login</button> </a>
</body>
</html>
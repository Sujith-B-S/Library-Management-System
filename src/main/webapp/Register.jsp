<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Register</title>
</head>
<body>
<h1>Admin Register</h1>

<form action="Register" method="POST">
	<input type = "text" name = "name" required="required" placeholder="Name"><br><br>
	<input type = "email" name = "email" required="required" placeholder="Email"><br><br>
	<input type = "password" name = "pwd" required="required" placeholder="Password"><br><br>
	<input type = "password" name = "cpwd" required="required" placeholder="Confirm Password"><br><br>
	<input type = "text" name = "address" required="required" placeholder="Address"><br><br>
	<input type = "tel" name = "phone" required="required" placeholder="Phone Number"><br><br>
	<input type = "submit" value = "Register">
</form>
<a href = "login.jsp"> <button>Login</button> </a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
	<h1>Register Student</h1>
	
	<form action="StudentRegistration" method="POST">
		<input type = "text" name = "name" placeholder="Name"><br><br>
		<input type = "email" name = "email" placeholder="Email"><br><br>
		<input type = "password" name = "pwd" placeholder="Password"><br><br>
		<input type = "password" name = "cpwd" placeholder="Confirm Password"><br><br>
		<input type = "tel" name = "phone" placeholder="Phone Number"><br><br>
		<input type = "text" name = "address" placeholder="Address"><br><br>
		<input type = "text" name = "department" placeholder="Department"><br><br>
		<input type = "text" name = "sem" placeholder="Semester"><br><br>
		<input type = "submit" value = "Register">		
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Issue Book</title>
</head>
<body>
	<form action="IssueBook" method="POST">
		<input type = "text" name = "sId" placeholder="Student ID">
		<input type = "text" name = "bId" placeholder="Book ID">
		<input type = "date" name = "returnDate" placeholder="Return Date">
		
		<input type = "submit" value = "Issue">
		
	</form>
</body>
</html>
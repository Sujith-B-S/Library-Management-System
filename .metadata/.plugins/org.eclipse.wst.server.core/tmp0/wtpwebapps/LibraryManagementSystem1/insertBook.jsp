<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Book Page</title>
</head>
<body>
	<h1>Insert the New Book</h1>
	
	<form action="InsertBook">
		<input type = "text" name = "bName" required="required" placeholder="Book Name"><br><br>
		<input type = "text" name = "publisher" required="required" placeholder="Publisher"><br><br>
		<input type = "text" name = "quantity" required="required" placeholder="Qunatity"><br><br>
		<input type = "text" name = "price" required="required" placeholder="Price"><br><br>
		<input type = "date" name = "pDate" required="required" placeholder="Publication Date"><br><br>
		<input type = "text" name = "description" required="required" placeholder="Description"><br><br>
		<input type = "text" name = "language" required="required" placeholder="Language"><br><br>
		<input type = "submit" value = "Confirm">
	</form>
</body>
</html>
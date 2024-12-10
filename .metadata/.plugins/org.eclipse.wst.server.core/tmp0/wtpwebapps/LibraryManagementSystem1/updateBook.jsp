<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.sg.entityclass.Books" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book</title>
</head>
<body>

	<h1>Update Book</h1>
	<%
	Books b = (Books) request.getSession().getAttribute("book");
 	
 			if(b != null)
 			{
				%>
					
				<form action="UpdateBook" method="POST">
					<input type = "text" name = "bId" value="<%= b.getbId() %>" readonly="readonly"><br><br>
					<input type = "text" name = "bname" value="<%= b.getbName() %>"><br><br>
					<input type = "text" name = "publisher" value="<%= b.getPublisher() %>"><br><br>
					<input type = "text" name = "category" value="<%= b.getCategory() %>"><br><br>
					<input type = "text" name = "quantity" value="<%= b.getQuantity()%>"><br><br>
					<input type = "text" name = "price" value="<%= b.getPrice()%>"><br><br>
					<input type = "date" name = "pDate" value="<%= b.getPublicationDate()%>"><br><br>
					<input type = "text" name = "description" value="<%= b.getDescription()%>"><br><br>
					<input type = "text" name = "lang" value="<%= b.getLanguage()%>"><br><br>
					<input type = "submit" value = "Update">
				</form>
					
				<%}
 			else
 			{%>
 				<p>Book List is Empty</p>
 			<%}
 	%>

</body>
</html>
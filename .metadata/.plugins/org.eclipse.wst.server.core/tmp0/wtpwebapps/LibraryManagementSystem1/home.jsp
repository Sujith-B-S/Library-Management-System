<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %>
    <%@ page import = "com.sg.entityclass.Books" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
 	<h1>Library Management System</h1>
 	
 	<a href="insertBook.jsp"> <button>Add Books</button> </a>
 	<a href="registerStudent.jsp"> <button>Register Student</button> </a>
 	<a href="ShowStudents"> <button>Students</button> </a>
 	<a href="issueBook.jsp"> <button>Issue Books</button> </a>
 	<a href="ShowIssuedBooks"> <button>Show Issued Books</button> </a>
 	
 	<%
 			ArrayList<Books> bList = (ArrayList<Books>) request.getSession().getAttribute("bList");
 	
 			if(bList != null && !bList.isEmpty())
 			{
				for(Books b : bList)
				{%>
					
					<p><%= b.getbId() %></p>
					<p><%= b.getbName() %></p>
					<p><%= b.getPublisher() %></p>
					<p><%= b.getCategory() %></p>
					<p><%= b.getQuantity() %></p>
					<p><%= b.getPrice() %></p>
					<p><%= b.getPublicationDate() %></p>
					<p><%= b.getDescription() %></p>
					<p><%= b.getLanguage() %></p>
					<a href = "FetchOne?bookId=<%= b.getbId() %>"> <button>Update</button> </a>
					<a href = "DeleteBook?bookId=<%= b.getbId() %>"> <button>Delete</button> </a>
				<%}
 			}
 			else
 			{%>
 				<p>Book List is Empty</p>
 			<%}
 	%>
</body>
</html>
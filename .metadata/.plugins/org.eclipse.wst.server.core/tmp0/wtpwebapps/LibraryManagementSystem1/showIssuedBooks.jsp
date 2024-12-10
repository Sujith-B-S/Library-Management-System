<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "com.sg.entityclass.IssuedBooks" %>
<%@ page import = "com.sg.entityclass.Student" %>
<%@ page import = "com.sg.entityclass.Books" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showIssuedBooks</title>
</head>
<body>
	<%
		ArrayList<IssuedBooks> ibList = (ArrayList<IssuedBooks>)request.getSession().getAttribute("ibList");
	
		if(ibList != null && !ibList.isEmpty())
		{
			for(IssuedBooks ib : ibList)
			{
				Student s = ib.getStudent();
				Books b = ib.getBook();
			%>
				<p><%= s.getsId() %></p> 
				<p><%= s.getsName() %></p> 
				<p><%= s.getSem() %></p> 
				<p><%= s.getDepartment() %></p> 
				<p><%= b.getbId() %></p> 
				<p><%= b.getbName() %></p> 
				<p><%= b.getPublisher()%></p> 
				<p><%= b.getPrice()%></p> 
				<p><%= ib.getIssueDate()%></p> 
				<p><%= ib.getReturnDate()%></p> 

				
			<%}
		}
		else
		{
			%>
			
			<p>Nooo books are Issued</p>
		<%}
	%>
</body>
</html>
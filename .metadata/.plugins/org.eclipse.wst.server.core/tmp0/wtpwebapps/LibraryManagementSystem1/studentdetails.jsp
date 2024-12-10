<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "com.sg.entityclass.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>

	<%
		ArrayList<Student> sList = (ArrayList<Student>)request.getSession().getAttribute("sList");
	
		if(sList != null && !sList.isEmpty())
		{
			for(Student s : sList)
			{%>
				<p><%= s.getsId() %></p>
				<p><%= s.getsName() %></p>
				<p><%= s.getEmail() %></p>
				<p><%= s.getPhone() %></p>
				<p><%= s.getAddress() %></p>
				<p><%= s.getDepartment() %></p>
				<p><%= s.getSem() %></p>
				<p><%= s.getRegistrationDate() %></p>
			<%}
		}
	%>
	
</body>
</html>
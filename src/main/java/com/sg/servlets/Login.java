package com.sg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sg.HibernateDAOImpl.HibernateDAOImpl;
import com.sg.entityclass.Admins;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		
		HibernateDAOImpl hdaoi = new HibernateDAOImpl();
		
		Admins a = hdaoi.fetchSpecificAdmin(email);
		
		if(a != null)
		{
			if(password.equals(a.getPassword()))
			{
				req.getSession().setAttribute("LoggedInAdmin", a);
				resp.sendRedirect("home.jsp");
			}
			else
			{
				pw.println("Incorrect Password");
			}
		}
		else
		{
			pw.println("Admin Doesnot Exist");
		}
		
	}

}

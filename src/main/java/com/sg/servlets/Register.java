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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		
		HibernateDAOImpl hdaoi = new HibernateDAOImpl();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		String cPassword = req.getParameter("cpwd");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		
		Admins a = new Admins(name, email, cPassword, address, phone);
		
		if(password.equals(cPassword))
		{
			hdaoi.inserAdminData(a);
			resp.sendRedirect("login.jsp");
		}
		else
		{
			pw.println("Password Donot match");
		}
		
	}

}

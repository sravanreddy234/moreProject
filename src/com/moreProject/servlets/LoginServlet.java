package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moreProject.db.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=null;
		String n = request.getParameter("UserId");
		String p = request.getParameter("Password");
		System.out.println("In Login Servlet");
		if (LoginDAO.validate(n, p)) {
			System.out.println("valid user");
			session = request.getSession(false);
			session.setAttribute("UserId", n);
			if (LoginDAO.role(n)) {
				session.setAttribute("role", "admin");
				RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
				rd.forward(request, response);
				System.out.println("admin logged in");
				out.println("admin logged in: "+n);
				out.println("<alert>welcome : "+LoginDAO.userName(n)+"</alert>");
				System.out.println("Welcome:"+LoginDAO.userName(n));
			} else {
<<<<<<< HEAD
				RequestDispatcher rd = request.getRequestDispatcher("Employee.jsp");
=======
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeServlet");
>>>>>>> origin/master
				/*session = request.getSession();
				session.setAttribute("User", n);*/
				String str=(String) session.getAttribute("UserId");
				System.out.println("UserId From Session in Login Servlet"+str);
				out.println("<alert>welcome : "+LoginDAO.userName(n)+"</alert>");
				System.out.println("Employee logged in");
				out.println("Employee logged in: "+n);
				rd.include(request, response);
			}
		} else {
			out.println("Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
			System.out.println("Invalid Credentials");
			out.println("Invalid Credentials");

		}

		out.close();

	}

}

package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moreProject.db.DataBase;
import com.moreProject.db.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("UserId");
		String p = request.getParameter("Password");

		if (LoginDAO.validate(n, p)) {
			System.out.println("valid user");
			if (LoginDAO.role(n)) {
				RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
				rd.forward(request, response);
				System.out.println("admin logged in");
				out.println("admin logged in: "+n);
				out.println("<alert>welcome : "+LoginDAO.userName(n)+"</alert>");
				System.out.println("Welcome:"+LoginDAO.userName(n));
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeServlet");
				rd.include(request, response);
				System.out.println("Employee logged in");
				out.println("Employee logged in: "+n);

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

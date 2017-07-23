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
				if(LoginDAO.role(n)) {
			RequestDispatcher rd = request.getRequestDispatcher("Admin.html");
			rd.forward(request, response);
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("Home.html");
					rd.include(request, response);
				}
		} else  {
			out.println("Invalid Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			rd.include(request, response);
		}

		out.close();

	}

}

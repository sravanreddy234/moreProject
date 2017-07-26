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


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();
	        
	        RequestDispatcher rd=null;
	        request.getRequestDispatcher("Home.jsp").include(request, response);
	        
	        HttpSession session = request.getSession(false);
	        session.invalidate();
	        out.println("<h1>Your Logged Out <h1>");
		
	}

}

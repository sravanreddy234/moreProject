package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moreProject.bean.UserDetails;
import com.moreProject.db.CrudOperations;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String id = request.getParameter("UserId");
		String name = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String email = request.getParameter("Email");
		String contact = request.getParameter("Contact");
		String role = request.getParameter("role");

		UserDetails ud = new UserDetails();

		ud.setUserId(id);
		ud.setUserName(name);
		ud.setPassword(password);
		ud.setEmail(email);
		ud.setContact(contact);
		ud.setRole(role);

		System.out.println("in user servlet");

		pw.println(id);
		pw.println(name);
		pw.println(password);
		pw.println(email);
		pw.println(contact);
		pw.println(role);

		int status = 0;
		try {
			status = CrudOperations.save(ud);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * if(status>0){ pw.print("<p>Record saved successfully!</p>");
		 * request.getRequestDispatcher("index.html").include(request, response); }else{
		 * pw.println("Sorry! unable to save record"); }
		 */
		response.sendRedirect("Home.jsp");
		pw.close();
	}

}

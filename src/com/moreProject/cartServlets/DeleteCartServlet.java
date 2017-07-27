package com.moreProject.cartServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moreProject.db.CartDAO;
import com.moreProject.db.CrudDAO;

import com.moreProject.db.CrudDAO;

@WebServlet("/DeleteCartServlet")
public class DeleteCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		  
        
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		String pid= request.getParameter("ProductId");
		String uid =(String) session.getAttribute("UserId");
		
		
        CartDAO.delete(pid, uid);
=======
		String pid=request.getParameter("ProductId");  
        //int id=Integer.parseInt(sid);  
       CrudDAO.delete(pid); 
>>>>>>> origin/master
        response.sendRedirect("ViewCartServlet");  
    }  

}

package com.moreProject.cartServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moreProject.bean.Cart;
import com.moreProject.db.CartDAO;


@WebServlet("/AddCartServlet")
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		String pid= request.getParameter("ProductId");
		String uid =(String) session.getAttribute("UserId");
	
		//int quantity=Integer.parseInt(request.getParameter("quantity"));
		System.out.println(uid);
		
		System.out.println("in add to cart servlet");
		
		Cart c = new Cart();
		
		c.setProductId(pid);
		c.setUserId(uid);
		
		
		//c.setQuantity(quantity);
		

		boolean status=false;
		status=CartDAO.addCart(pid, uid);
		RequestDispatcher rd=null;
		rd=request.getRequestDispatcher("ViewCartServlet");
		
		rd.include(request, response);
		
	
	}

}

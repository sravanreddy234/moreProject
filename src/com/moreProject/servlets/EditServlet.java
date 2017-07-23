package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moreProject.bean.Product;
import com.moreProject.db.CrudDAO;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<h1>Update Employee</h1>");  
	        String id=request.getParameter("ProductId");
	        
	        Product pd=CrudDAO.getProductById(id);
	          
	       
	          
	        out.print("<form action='EditServlet2' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td>ProductId</td><td><input type='hidden' name='ProductId' value='"+pd.getProductId()+"'/></td></tr>");  
	        out.print("<tr><td>ProductName:</td><td><input type='text' name='ProductName' value='"+pd.getProductName()+"'/></td></tr>");  
	        out.print("<tr><td>ProductDesc:</td><td><input type='text' name='ProductDesc' value='"+pd.getProductDesc()+"'/></td></tr>");   
	        out.print("<tr><td>Price:</td><td><input type='text' name='Price' value='"+pd.getPrice()+"'/></td></tr>");  
	        out.print("<tr><td>ImageUrl:</td><td><input type='file' name='ImageUrl' value='"+pd.getImageUrl()+"'/></td></tr>");
	        out.print("</td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
	        out.close();  
	    }  

}

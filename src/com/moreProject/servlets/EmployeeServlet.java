package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moreProject.bean.Product;
import com.moreProject.db.CrudDAO;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>More|ProductsList</title>");

	        out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +"/css/table.css' />");
	         
	        out.println("</head>");
	        out.println("<body background='pics/nature1.jpg'>"); 
	        out.println("<h1>Product List</h1>");  
	          
	        List<Product> list=CrudDAO.getAllProducts();
	          
	        out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>ProductId</th><th>ProductName</th><th>ProductDesc</th><th>Price</th><th>Add to Cart</th></tr>");  
	        for(Product pd:list){  
	        	out.print("<tr><td>"+pd.getProductId()+"</td><td>"+pd.getProductName()+"</td><td>"+pd.getProductDesc()+"</td><td>"+pd.getPrice()+"</td><td><a href='AddCartServlet?ProductId'>Add to Cart</a></td></tr>");  
	        
	        
	        }  
	        out.print("</table>");  
	        out.print("</body>");
	        out.print("</html>");
 
	        out.close();  
	}

}

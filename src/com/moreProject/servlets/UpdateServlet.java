package com.moreProject.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.moreProject.bean.Product;
import com.moreProject.db.CrudDAO;

@WebServlet("/UpdateServlet")
@MultipartConfig(maxFileSize = 16177215)
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String id=request.getParameter("ProductId");  
	          
	        String name=request.getParameter("ProductName");  
	        String desc=request.getParameter("ProductDesc");  
	        String price=request.getParameter("Price");  
	       
	        InputStream inputStream = null;
			// obtains the upload file part in this multipart request
			Part filePart = request.getPart("imageUrl");
			if (filePart != null) {
				// prints out some information for debugging
				System.out.println(filePart.getName());
				System.out.println(filePart.getSize());
				System.out.println(filePart.getContentType());

				// obtains input stream of the upload file
				inputStream = filePart.getInputStream();
			}
	          
			System.out.println("in add product servlet");

			

			Product pd = new Product();
			pd.setProductId(id);
			pd.setProductName(name);
			pd.setProductDesc(desc);
			pd.setPrice(price);
			pd.setImageUrl(inputStream);

			int status = 0;
			status = CrudDAO.update(pd);
			/*
			 * if(status>0){ pw.print("<p>Record saved successfully!</p>");
			 * request.getRequestDispatcher("index.html").include(request, response); }else{
			 * pw.println("Sorry! unable to save record"); }
			 */
			//response.sendRedirect("hello.html");
			out.close();
	    }  
		

	
}

package com.moreProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moreProject.bean.Product;
import com.moreProject.db.CrudDAO;  
@WebServlet("/ViewServlet") 
@MultipartConfig(maxFileSize = 16177215)
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        //request.getRequestDispatcher("Header.jsp").include(request, response);
        HttpSession session = request.getSession(false);
        String s1=(String) session.getAttribute("UserId");
        String s2= (String) session.getAttribute("role");
        System.out.println("Session UserId :"+s1);
        System.out.println("session role :"+s2);
        out.println("<html>");
        out.println("<head>");
        out.println("<title>More|ProductsList</title>");
        request.getRequestDispatcher("AdminHeader.jsp").include(request, response);
        out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +"/css/table.css' />");
         
        out.println("</head>");
        out.println("<body background='pics/nature1.jpg'>");
        out.println("<a href='AddProduct.jsp'><input type='button' value='Add Products'></a>");  
        out.println("<h1>Product List</h1>");  
          
        List<Product> list=CrudDAO.getAllProducts();
          
        out.print("<table >");  
        out.print("<tr><th>ProductId</th><th>ProductName</th><th>ProductDesc</th><th>Price</th><th>Edit</th><th>Delete</th></tr>");  
        for(Product pd:list){  
        	out.print("<tr><td>"+pd.getProductId()+"</td><td>"+pd.getProductName()+"</td><td>"+pd.getProductDesc()+"</td><td>"+pd.getPrice()+"</td><td><a href='EditServlet?ProductId="+pd.getProductId()+"'>edit</a></td><td><a href='DeleteServlet?ProductId="+pd.getProductId()+"'>delete</a></td></tr>");          
        
        }  
        out.print("</table>"); 
        out.print("</body>");
        out.print("</html>");
        //request.getRequestDispatcher("Footer.jsp").include(request, response);
  
        out.close();  
    }  
}

package com.moreProject.cartServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moreProject.bean.ExtraCart;
import com.moreProject.bean.Product;
import com.moreProject.db.CartDAO;


@WebServlet("/ViewCartServlet")
public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        //request.getRequestDispatcher("Header.jsp").include(request, response);
        HttpSession session = request.getSession(false);
        String s1=(String) session.getAttribute("UserId");
        System.out.println("in View CartServlet");
        System.out.println("Session UserId :"+s1);
      
        out.println("<html>");
        out.println("<head>");
        out.println("<title>MoreStore|Cart</title>");

        out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +"/css/table.css' />");
        request.getRequestDispatcher("Header.jsp").include(request, response);
        out.println("</head>");
        out.println("<body background='pics/nature1.jpg'>");
        out.println("<h1>Cart List</h1>");  
          
        String pid=request.getParameter("ProductId");
        String uid=(String) session.getAttribute("UserId");
        /*Product pd=CartDAO.getProductById(pid);
        Cart c=CartDAO.getCartById(pid, uid);  */
        
        /*List<Product> list=CartDAO.getProductById(pid);
        List<Cart> list1 = CartDAO.getCartById(uid);*/
        //List<Product> pd=CartDAO.getProductById(pid);
        List<ExtraCart> list = CartDAO.getAllCartProducts(uid);
        
        out.print("<table >");  
        out.print("<tr><th>ProductId</th><th>ProductName</th><th>ProductDesc</th><th>Price</th><th>Quantity</th><th>Total</th><th>Remove</th></tr>");  
          for(ExtraCart ec:list) {
        	out.print("<tr><td>"+ec.getProId()+"</td><td>"+ec.getName()+"</td><td>"+ec.getProDesc()+"</td><td>"+ec.getPrice()+"</td><td>"+ec.getQuantity()+"</td><td>"+ec.getTotal()+"</td><td><a href='DeleteCartServlet?ProductId="+ec.getProId()+"'>delete</a></td></tr>");          
        
          }
          out.print("<tr><th colspan='5' align='center'>CartTotal</th><td >"+CartDAO.grandTotal(uid)+"</td></tr>");
          out.print("<tr><th colspan='5' align='center'>GST GrandTotal</th><td>"+CartDAO.gst(uid)+"</td></tr>");
          
        out.print("</table>"); 
        out.println("<a href='CheckOutServlet'><input type='button' value='CheckOut'></a>");
        out.print("</body>");
        out.print("</html>");
        //request.getRequestDispatcher("Footer.jsp").include(request, response);
  
        out.close();  
    }  
}


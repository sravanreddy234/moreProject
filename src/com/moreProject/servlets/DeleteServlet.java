package com.moreProject.servlets;  
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moreProject.db.CrudDAO;

@WebServlet("/DeleteServlet")  
public class DeleteServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String uid=request.getParameter("userid");  
        //int id=Integer.parseInt(sid);  
       // CrudDAO.delete(ProductId); 
        response.sendRedirect("ViewServlet");  
    }  
}  
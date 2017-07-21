package com.moreProject.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	public static boolean validate(String UserId,String Password){  
		boolean status=false;  
		try{  
		/*Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); */ 
		  Connection con=DataBase.getConnection();    
		PreparedStatement ps=con.prepareStatement(  
		"select * from userdetails where userid=? and password=?");  
		ps.setString(1,UserId);  
		ps.setString(2,Password);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){
			System.out.println(e);
			}  
		return status;  
		}  

}

package com.moreProject.db;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.moreProject.bean.Product;

public class CrudDAO {
	
	public static int save(Product pd){  
        int status=0;  
        try{  
            Connection con=DataBase.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into product(productid,productname,productdesc,price) values (?,?,?,?)");  
            ps.setString(1,pd.getProductId());  
            ps.setString(2,pd.getProductName());  
            ps.setString(3,pd.getProductDesc());  
            ps.setString(4,pd.getPrice());
            //ps.setBlob(5, (Blob) pd.getImageUrl());
            /*if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(5, inputStream);
            }*/
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    /*public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set name=?,password=?,email=?,country=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
            ps.setInt(5,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
	
	 public static int delete(String UserId){  
	        int status=0;  
	        try{  
	            Connection con=DataBase.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from userdetails where id=?");  
	            ps.setString(1,UserId);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  */

}

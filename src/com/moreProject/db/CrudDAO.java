package com.moreProject.db;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.moreProject.bean.Product;
import com.moreProject.bean.UserDetails;
import com.moreProject.servlets.AddServlet;

public class CrudDAO {
	
	public static int save(Product pd){  
        int status=0;  
        try{  
            Connection con=DataBase.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into product(productid,productname,productdesc,price,imageurl) values (?,?,?,?,?)");  
            ps.setString(1,pd.getProductId());  
            ps.setString(2,pd.getProductName());  
            ps.setString(3,pd.getProductDesc());  
            ps.setString(4,pd.getPrice());
           // ps.setBlob(5, (Blob) pd.getImageUrl());
           /* if (AddServlet.inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(5, AddServlet.inputStream);
            }*/
             ps.setBlob(5, pd.getImageUrl()); 
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Product pd){  
        int status=0;  
        try{  
            Connection con=DataBase.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update product set productname=?,productdesc=?,price=?,imageurl=? where id=?");  
            ps.setString(1, pd.getProductName()); 
            ps.setString(2, pd.getProductDesc());
            ps.setString(3, pd.getPrice());
            ps.setBlob(4, pd.getImageUrl());
             ps.setString(5, pd.getProductId()); 
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
	
	 /*public static int delete(String UserId){  
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
	
	public static Product getProductById(String ProductId) {
		Product pd = new Product();

		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product where productid=?");
			ps.setString(1, ProductId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				pd.setProductId(rs.getString(1));
				pd.setProductName(rs.getString(2));
				pd.setProductDesc(rs.getString(3));
				pd.setPrice(rs.getString(4));
				pd.setImageUrl(rs.getBinaryStream(5));
				
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return pd;
	}


}

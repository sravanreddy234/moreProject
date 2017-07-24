package com.moreProject.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.moreProject.bean.Product;

public class CrudDAO {
	static Connection con=DataBase.getConnection(); 
	public static int save(Product pd){  
        int status=0;  
        try{  
             
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
	
	 public static int delete(String ProductId){  
	        int status=0;  
	        try{  
	            Connection con=DataBase.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from product where productid=?");  
	            ps.setString(1,ProductId);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
    
    public static List<Product> getAllProducts(){  
        List<Product> list=new ArrayList<Product>();  
          
        try{  
           // Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from product");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Product pd = new Product();
                pd.setProductId(rs.getString(1));
                pd.setProductName(rs.getString(2));
                pd.setProductDesc(rs.getString(3));
                pd.setPrice(rs.getString(4));
                //pd.setImageUrl(rs.getBinaryStream(5));
                list.add(pd);
                System.out.println("in list");
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
	
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

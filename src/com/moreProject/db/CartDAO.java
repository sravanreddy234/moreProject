package com.moreProject.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.moreProject.bean.Cart;

public class CartDAO {

	static Connection con = DataBase.getConnection();

	public static boolean addCart(String pid, String uid) {
		int status = 0;

		try {

			PreparedStatement ps1 = con.prepareStatement("select * from cart where productid=? and userid=? ");
			ps1.setString(1, pid);
			ps1.setString(2, uid);

			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {
				PreparedStatement ps=con.prepareStatement("update cart set quantity=? where productid=? and userid=?");
				int i=rs.getInt("quantity");
				i++;
				ps.setInt(1, i);
				ps.setString(2, pid);
				ps.setString(3, uid);
				
				int y=ps.executeUpdate();
				System.out.println("quantity increased"+y);
				
				
			} else {
				PreparedStatement ps = con.prepareStatement("insert into cart(productid,userid,quantity) values (?,?,?) ");
				ps.setString(1, pid);
				ps.setString(2, pid);
				ps.setInt(3, 1);
				int i =ps.executeUpdate();
				System.out.println("inserted into cart table"+i);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;

	}
	
	
	
	
	
	
	
	
	

	public static int update(Cart c) {
		return 0;
	}

	public static int delete(String CartId) {

		return 0;
	}
}

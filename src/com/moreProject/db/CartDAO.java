package com.moreProject.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.moreProject.bean.Cart;
import com.moreProject.bean.ExtraCart;
import com.moreProject.bean.Product;

public class CartDAO {

	static Connection con = DataBase.getConnection();

	public static boolean addCart(String pid, String uid) {
<<<<<<< HEAD
=======
		
>>>>>>> origin/master

		try {

			PreparedStatement ps1 = con.prepareStatement("select * from cart where productid=? and userid=? ");
			ps1.setString(1, pid);
			ps1.setString(2, uid);

			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {
				PreparedStatement ps = con
						.prepareStatement("update cart set quantity=? where productid=? and userid=?");
				int i = rs.getInt("quantity");
				i++;
				ps.setInt(1, i);
				ps.setString(2, pid);
				ps.setString(3, uid);

				int y = ps.executeUpdate();
				System.out.println("quantity increased" + y);

			} else {
				PreparedStatement ps = con
						.prepareStatement("insert into cart(productid,userid,quantity) values (?,?,?) ");
				ps.setString(1, pid);
				ps.setString(2, uid);
				ps.setInt(3, 1);
				int i = ps.executeUpdate();
				System.out.println("inserted into cart table" + i);

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

<<<<<<< HEAD
	public static boolean delete(String pid, String uid) {
		boolean status = false;
		try {

			PreparedStatement ps1 = con.prepareStatement("select * from cart where productid=? and userid=? ");
			ps1.setString(1, pid);
			ps1.setString(2, uid);

			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {

				int i = rs.getInt("quantity");
				if (i > 1) {
					i = i - 1;
					PreparedStatement ps = con
							.prepareStatement("update cart set quantity=? where productid=? and userid=?");
					ps.setInt(1, i);
					ps.setString(2, pid);
					ps.setString(3, uid);

					int y = ps.executeUpdate();
					System.out.println("quantity increased" + y);
					status = true;
					return status;
				} else {
					PreparedStatement ps = con.prepareStatement("delete from cart where productid=? and userid=?");
					ps.setString(1, pid);
					ps.setString(2, uid);

					int i1 = ps.executeUpdate();
					System.out.println("Removed from cart table" + i1);
					status = true;
					return status;
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return status;
	}

	public static double gst(String uid) {
		double d = grandTotal(uid);
		double total = 0;
		if (d < 3000) {
			total = ((15.0 / 100.0) * d) + d;
		} else if (d < 7000) {
			total = ((20.0 / 100.0) * d) + d;
		} else {
			total = ((25.0 / 100.0) * d) + d;
		}

		return total;

	}

	public static double grandTotal(String uid) {

		double d = 0;

		List<ExtraCart> ec = getAllCartProducts(uid);
		for (ExtraCart list : ec) {
			d = d + list.getTotal();

		}

		return d;

	}

=======
	public static int delete(String pid){  
        int status=0;  
        try{  
        	System.out.println("in delete cart method");
            Connection con=DataBase.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from cart where productid=?");  
            ps.setString(1,pid);  
            status=ps.executeUpdate();  
             con.commit();
             System.out.println(status);
            //con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
	
	/*public static Cart getCartById(String pid,String uid) {
		Product pd = new Product();
		Cart c = new Cart();
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from cart where productid=? and userid=?");
			ps.setString(1, pid);
			ps.setString(2, uid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				pd.setProductId(rs.getString(1));
				pd.setProductName(rs.getString(2));
				pd.setProductDesc(rs.getString(3));
				pd.setPrice(rs.getString(4));
				//pd.setImageUrl(rs.getBinaryStream(5));
				c.setProductId(rs.getString("productid"));
				c.setUserId(rs.getString("userid"));
				c.setQuantity(rs.getInt("quantity"));
			}
			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return c;
	}*/
	
	public static List<Cart> getCartById(String uid) {
		List<Cart> list = new ArrayList<Cart>();

		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from cart where userid=?");
			ps.setString(1, uid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Cart c = new Cart();
				
				c.setUserId(rs.getString("userid"));
				c.setQuantity(rs.getInt("quantity"));
				//pd.setImageUrl(rs.getBinaryStream(5));
				list.add(c);
				
			}
			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}
	
	
	public static Product getProductById(String pid) {
		//List<Product> list = new ArrayList<Product>();
		Product pd = new Product();
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from product where productid=?");
			ps.setString(1, pid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				pd.setProductId(rs.getString("productid"));
				pd.setProductName(rs.getString("productname"));
				pd.setProductDesc(rs.getString("productdesc"));
				pd.setPrice(rs.getString("price"));
				
				//pd.setImageUrl(rs.getBinaryStream(5));
				/*list.add(pd);*/
			}
			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return pd;
	}
	/*public static List<Cart> getAllCartProducts(String uid) {

		System.out.println("in get Cart Products of user: " + uid);
		List<Cart> list = new ArrayList<Cart>();

		try {
			PreparedStatement ps = con.prepareStatement("select productid, quantity from cart where userid=?");
			ps.setString(1, uid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("productid"));
				System.out.println("Quantity: "+rs.getInt("quantity"));
			}
			// List proid=new ArrayList();

			while (rs.next()) {
				Cart c = new Cart();
				
				String proid = rs.getString("productid");
				System.out.println("Product id "+proid);
				int i = rs.getInt("quantity");
				String name=null;
				double price=0;
				PreparedStatement ps1=con.prepareStatement("select name, price from product where id=?");
				ps1.setString(1, proid);
				ResultSet rs1=ps1.executeQuery();
				while(rs1.next()) {
					name=rs1.getString("name");
					price=rs1.getDouble("price");
				}
				
				c.set
				
				cp.setName(name);
				cp.setPrice(price);
				cp.setQuantity(i);
				list.add(c);
				cp.setName(ProductDAO.getProductName(proid));
				cp.setPrice(ProductDAO.getProductPrice(proid));
				cp.setQuantity(i);
				list.add(cp);
			}
			for (Cart cart : list) {
				System.out.println(cart);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}*/
	
	
>>>>>>> origin/master
	public static List<ExtraCart> getAllCartProducts(String uid) {

		System.out.println("in get Cart Products of user: " + uid);
		List<ExtraCart> list = new ArrayList<ExtraCart>();

		try {
			PreparedStatement ps = con.prepareStatement("select productid, quantity from cart where userid=?");
			ps.setString(1, uid);
			ResultSet rs = ps.executeQuery();
<<<<<<< HEAD

			while (rs.next()) {
				ExtraCart ec = new ExtraCart();

				String pid = rs.getString("productid");
				System.out.println("Product id " + pid);
				int i = rs.getInt("quantity");

				double price = 0;
				String name = null;
				String desc = null;

				PreparedStatement ps1 = con
						.prepareStatement("select productdesc,productname, price from product where productid=?");
				ps1.setString(1, pid);
				ResultSet rs1 = ps1.executeQuery();
				while (rs1.next()) {
					name = rs1.getString("productname");
					price = rs1.getDouble("price");
					desc = rs1.getString("productdesc");
				}
				ec.setProId(pid);
=======
			
			/*while(rs.next()) {
				System.out.println(rs.getString("productid"));
				System.out.println("Quantity: "+rs.getInt("quantity"));
			}*/
			// List proid=new ArrayList();

			while (rs.next()) {
				ExtraCart ec = new ExtraCart();
				
				String pid = rs.getString("productid");
				System.out.println("Product id "+pid);
				int i = rs.getInt("quantity");
				String name=null;
				String desc=null;
				double price=0;
				PreparedStatement ps1=con.prepareStatement("select productdesc,productname, price from product where productid=?");
				ps1.setString(1, pid);
				ResultSet rs1=ps1.executeQuery();
				while(rs1.next()) {
					name=rs1.getString("productname");
					price=rs1.getDouble("price");
					desc=rs1.getString("productdesc");
				}
				
>>>>>>> origin/master
				ec.setName(name);
				ec.setPrice(price);
				ec.setProDesc(desc);
				ec.setQuantity(i);
				list.add(ec);
<<<<<<< HEAD

=======
				
				
>>>>>>> origin/master
			}
			for (ExtraCart ec : list) {
				System.out.println(ec);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
<<<<<<< HEAD

	}

	public static boolean deleteCart(String uid) {

		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from cart where userid=?");

			ps.setString(1, uid);
			
			int i=ps.executeUpdate();
			
			System.out.println("rows effected"+i);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

=======
>>>>>>> origin/master
	}

}



package com.moreProject.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	public static boolean validate(String UserId, String Password) {
		boolean status = false;
		try {
			
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from userdetails where userid=? and password=?");
			ps.setString(1, UserId);
			ps.setString(2, Password);

			ResultSet rs = ps.executeQuery();

			System.out.println("Welcome  " + UserId);

			status = rs.next();

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static boolean role(String UserId) {
		boolean status = false;
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select role from userdetails where userid=?");
			ps.setString(1, UserId);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			System.out.println(status);
			System.out.println(rs.getString("role"));
			

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

}

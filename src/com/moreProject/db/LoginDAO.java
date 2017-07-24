package com.moreProject.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	public static boolean validate(String UserId, String Password) {
		//boolean status = false;
		try {

			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from userdetails where userid=? and password=?");
			ps.setString(1, UserId);
			ps.setString(2, Password);

			ResultSet rs = ps.executeQuery();

			System.out.println("Welcome  " + UserId);

			//status = rs.next();
			while (rs.next()) {
				
				String s = rs.getString("username");
				System.out.println("Welcome " + s);
				return true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
		//return true;
	}

	public static boolean role(String UserId) {
		boolean status = false;
		// String s1 = "";
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from userdetails where userid=?");
			ps.setString(1, UserId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String s2 = rs.getString("role");
				System.out.println("role is : " + s2);
				if (s2.equals("admin")) {
					status=true;
					return status;
				}
			}
			//return status;

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

}

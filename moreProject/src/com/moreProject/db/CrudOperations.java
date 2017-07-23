package com.moreProject.db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.moreProject.bean.UserDetails;

public class CrudOperations {

	public static int save(UserDetails ud) throws ClassNotFoundException, SQLException {

		System.out.println("in crud operations");
		Connection con = DataBase.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into UserDetails values(?,?,?,?,?,?)");

		ps.setString(1, ud.getUserId());
		ps.setString(2, ud.getUserName());
		ps.setString(3, ud.getPassword());
		ps.setString(4, ud.getEmail());
		ps.setString(5, ud.getContact());
		ps.setString(6, ud.getRole());

		int status = ps.executeUpdate();
		System.out.println(status);
		con.close();
		return 0;
	}

	public static int update(UserDetails ud) {
		int status = 0;
		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"update userdetails set username=?,password=?,email=?,contact=?,role=? where id=?");

			ps.setString(1, ud.getUserName());
			ps.setString(2, ud.getPassword());
			ps.setString(3, ud.getEmail());
			ps.setString(4, ud.getContact());
			ps.setString(5, ud.getRole());
			ps.setString(6, ud.getUserId());

			status = ps.executeUpdate();

			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}

	public static UserDetails getEmployeeById(String UserId) {
		UserDetails ud = new UserDetails();

		try {
			Connection con = DataBase.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from userdetails where userid=?");
			ps.setString(1, UserId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				ud.setUserId(rs.getString(1));
				ud.setUserName(rs.getString(2));
				ud.setPassword(rs.getString(3));
				ud.setEmail(rs.getString(4));
				ud.setContact(rs.getString(5));
				ud.setRole(rs.getString(6));
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ud;
	}

}

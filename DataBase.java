package com.moreProject.db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/prjct", "sa", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}

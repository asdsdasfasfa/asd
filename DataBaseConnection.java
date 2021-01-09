package com.jishou.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {
	
	static String driverName="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/saa?user=root&password=123456&useSSL=true&serverTimezone=UTC";
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(driverName);
			conn= DriverManager.getConnection(url);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库加载失败");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("数据库加载失败");
		}finally {
			return conn;
		}
		
	}
}


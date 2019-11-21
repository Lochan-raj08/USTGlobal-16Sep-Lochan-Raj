package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {
public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			String driver =prop.getProperty("driver-class-name");
			Class.forName(driver);
			
//			
//			Driver driver = new Driver();      ///first line of jdbc
//			DriverManager.registerDriver(driver);
			String url = prop.getProperty("url"); ///step 2 Get connection
			conn = DriverManager.getConnection(url, prop);
			
			//Step 3 Issue SQL query
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			//Step 4 Read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("Id : "+id);
				System.out.println("NAme: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("===============================");
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			///close all JDBC objects or costly resources
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//end of main

}//end of MyfirstJDBC




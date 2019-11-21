package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;




public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Driver driver = new Driver();      ///first line of jdbc
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+ "user=root&password=root"; ///step 2 Get connection
			conn = DriverManager.getConnection(url);
			
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
			
			
		}catch(SQLException e) {
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
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main

}//end of MyfirstJDBC

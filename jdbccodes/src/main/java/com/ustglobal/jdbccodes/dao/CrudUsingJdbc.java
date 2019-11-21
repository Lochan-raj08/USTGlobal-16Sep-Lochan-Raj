package com.ustglobal.jdbccodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUsingJdbc {

	public static int insert(int id,String name,int sal,String gender) {
		String url="jdbc:mysql://localhost:3306/ust_global";
		String sql="insert into employee_info values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url,"root","");
					PreparedStatement st=con.prepareStatement(sql);
					){

				st.setInt(1, id);
				st.setString(2, name);
				st.setInt(3, sal);
				st.setString(4, gender);
				return st.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public static int delete(int id) {
		String url="jdbc:mysql://localhost:3306/ust_global";
		String sql="delete from employee_Info where id=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url, "root", "");
					PreparedStatement st=con.prepareStatement(sql)
					){
				st.setInt(1, id);
				return st.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public static int update(int id,String name,int sal,String gender) {
		String url="jdbc:mysql://localhost:3306/ust_global";
		String sql="update employee_Info set name=?, sal=?, gender=? where id=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url,"root","");
					PreparedStatement st=con.prepareStatement(sql);
					){


				st.setString(1, name);
				st.setInt(2, sal);
				st.setString(3, gender);
				st.setInt(4, id);
				return st.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public static void select() throws SQLException {
		String url="jdbc:mysql://localhost:3306/ust_global";
		String sql="select * from employee_info";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, "root", "");
			 st=con.createStatement();
			 rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("id="+rs.getInt("id"));
				System.out.println("name="+rs.getString("name"));
				System.out.println("salary="+rs.getInt("sal"));
				System.out.println("gender="+rs.getString("gender"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				con.close();
			}
			if(st!=null) {
				st.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
	}
}


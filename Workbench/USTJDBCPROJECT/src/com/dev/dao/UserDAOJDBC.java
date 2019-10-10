package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.dev.beans.Users;

public class UserDAOJDBC implements UserDaoInterface {

	public UserDAOJDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	public static final String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db"
			+ "?user=root&password=root";
	
	Scanner sc = new Scanner(System.in);
	


	@Override
	public Users getAllInfo() {
		 String query = "select *from users_info";
		   Users u = new Users();
		   try (Connection conn= DriverManager.getConnection(dbUrl);
				   Statement st= conn.createStatement();
				   ResultSet rs = st.executeQuery(query)){
			   while(rs.next())
			   
			   {
				   u.setUserId(rs.getInt("userId"));
				u.setUserName(rs.getString("userName"));
				u.setEmailId(rs.getString("emailId"));
				System.out.println(u);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				   {
					
					   
				   }
			   
		return u;
	}

	@Override
	public void createProfile(Users user) {
		String query = "insert into users_info values(?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection(dbUrl);
			PreparedStatement ps= conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getEmailId());
			ps.setString(4, user.getPassword());
			
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println("Profile Created");
			}else
			{
				System.out.println("failed to create");
			

			}
		} catch (SQLException e) {
			System.out.println("failed to create");
			e.printStackTrace();
		}
		
  
		   
		
	}

}

package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCRetrieval {

	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   Connection conn = null;
   PreparedStatement pstmt = null;
	ResultSet rs = null; 
         try {
        	 //load the  driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded.....");
		
			//get connection via Driver
			   String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db"; 
			   
			   System.out.println("Enter the username and password");
			   String user= sc.nextLine();
			   String password= sc.nextLine();
			   conn = DriverManager.getConnection(dbUrl,user,password);
			   System.out.println("Connection Estd.....");
			   System.out.println("************");
			   
			   //issue query
			  String query="select * from users_info where userId=?";
			  pstmt=conn.prepareStatement(query);
			
			  System.out.println("EnterId.....");
			  pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			  rs  =  pstmt.executeQuery() ;
			  while(rs.next()) {                           //need to invoke a method next to process the result of sql
		        	int userId= rs.getInt("UserId");
		        	String userName = rs.getString("UserName");
		        	String emailId = rs.getString("emailId");
		        	String password1=rs.getString("password");  //not necessary bcz password is sensitive data
		           System.out.println("UserId:" +userId);
		           System.out.println("UserName:" +userName);
		           System.out.println("EmailId: "+ emailId);
		           System.out.println("Password:" +password1);
		           System.out.println("*******************");
		          }
			  

			  
			   
		
		} catch (Exception e) {
			  System.out.println("Something went wrong");
			e.printStackTrace();
		}
         
	}

}

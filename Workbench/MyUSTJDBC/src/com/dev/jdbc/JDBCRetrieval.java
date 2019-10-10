package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCRetrieval {

	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   Connection conn = null;
   PreparedStatement pstmt = null;
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
			  String query="select * from users_info where emailId=? and password= ?";
			  pstmt= conn.prepareStatement(query);
			  System.out.println("Enter email id.... ");
			  pstmt.setString(1, sc.nextLine());
			  System.out.println("Enter password.....");
			  pstmt.setString(2, sc.nextLine());
			  
			  int count= pstmt.executeUpdate();
			  
			  //process the query
			  if(count>0) {
				  System.out.println("Query ok +count+ row affected");
			  }else
			  {
				  System.out.println("Something went wrong");
			  }
			  
			   
		
		} catch (Exception e) {
			  System.out.println("Something went wrong");
			e.printStackTrace();
		}
         
	}

}

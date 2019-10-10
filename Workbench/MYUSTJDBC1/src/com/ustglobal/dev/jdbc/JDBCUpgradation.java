 package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpgradation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt= null;
		//load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			System.out.println("Driver loaded.....");
		//get connection 
			 String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db"; 
			 System.out.println("Enter username and password");
			 String user= sc.nextLine();
			 String password= sc.nextLine();
			 conn = DriverManager.getConnection(dbUrl,user,password);
			 System.out.println("Connection Estd...");
			 System.out.println("**************");
			 //issue query
			 String query= "Update users_info SET emailId = ? where userId= ? and password = ? ";
			pstmt=  conn.prepareStatement(query);
			System.out.println("Enter the new email id..");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter user id");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the password");
			pstmt.setString(3, sc.nextLine());
			
			int count= pstmt.executeUpdate();
			
			//process the result
			
			if(count>0) {
				System.out.println("Query OK "+count+"  row affected");
				
			}else{
				System.out.println("Something went wrong");
			}
		
			
			
			
	
			 
					 
			 
			 
			
			
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		

	}

}

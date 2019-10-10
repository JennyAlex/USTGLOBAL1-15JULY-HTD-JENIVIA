package com.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt= null;



		try {
			//load for driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded......");

			//get connection
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db"; 
			String filePath= "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

			FileReader reader = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(reader);
		


			conn = DriverManager.getConnection(dbUrl,prop);
			System.out.println("Connection Estd...");
			System.out.println("**************");
			
			//issue the query 
			
			String query= "Delete from users_info where userId = ? and password = ?" ;
			pstmt=conn.prepareStatement(query);
			System.out.println("ENter the user id for deletion.....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("ENter the password for deletion......");
			pstmt.setString(2, sc.nextLine());
			
			int count= pstmt.executeUpdate();
			
			//process the results
			if(count>0) {
				System.out.println("Query ok "+count+" row affected");
			}else
			{
				System.out.println("SOmethng went wrong");
			}


		} catch (Exception e) {
			System.out.println("SOmethng went wrong");
			e.printStackTrace();
		}



	}

}

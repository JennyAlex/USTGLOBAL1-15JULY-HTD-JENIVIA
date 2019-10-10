package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;    //to perform get connection  
		Statement stmt = null;
		ResultSet rs = null;                           


		try {

			//Load the driver 
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded....");

			//Get Connection via Driver

			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);  //to invoke get connection
			System.out.println("Connection established....");
			System.out.println("*************");

			//Issue the SQL query via connection
 			String query= "select * from users_info";
			stmt=	conn.createStatement();  //to make query in statment
			rs  =  stmt.executeQuery(query) ;   //to execute query only for select statemtn                     
                
			//Process the results returned by SQL query
          while(rs.next()) {                           //need to invoke a method next to process the result of sql
        	int userId= rs.getInt("UserId");
        	String userName = rs.getString("UserName");
        	String emailId = rs.getString("emailId");
        	String password=rs.getString("password");  //not necessary bcz password is sensitive data
           System.out.println("UserId:" +userId);
           System.out.println("UserName:" +userName);
           System.out.println("EmailId: "+ emailId);
           System.out.println("Password:" +password);
           System.out.println("*******************");
          }




		} catch (SQLException e) {

			e.printStackTrace();
		}finally       //to close jdbc objects
		{
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
		
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}  
			}
		}
		}
	



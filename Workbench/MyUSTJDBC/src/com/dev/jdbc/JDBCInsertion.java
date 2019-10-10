package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    Connection conn= null;
	    PreparedStatement pstmt = null;
	    
    try {
    	
	//Load the Driver
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded......");
	
    //get connection via Driver
   String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db"; 
   
   System.out.println("Enter the username and password");
   String user= sc.nextLine();
   String password= sc.nextLine();
   conn = DriverManager.getConnection(dbUrl,user,password);
   System.out.println("Connection Estd.....");
   System.out.println("************");
  
   //issue the query
   
   String query = "Insert into users_info values(?,?,?,?)";      //dynamic query
     pstmt=  conn.prepareStatement(query);
                                                               
    
	 System.out.println("Enter the user Name.......");
     pstmt.setString(1, sc.nextLine());
     System.out.println("Enter the User emailId");
     pstmt.setString(2, sc.nextLine());
     System.out.println("Enter the password");
     pstmt.setString(3, sc.nextLine());
     System.out.println("Enter the User Id....");
     pstmt.setInt(4, Integer.parseInt(sc.nextLine()));    //take string as an input argument and return integer
           int count = pstmt.executeUpdate();  //for any query other than select query this method is used
           
           //process the result
           if(count>0) {
        	   System.out.println("Query Ok  "+count+" row affected");
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

package com.ustglobal.dev.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {


        
		Connection conn = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
		Scanner sc= new Scanner(System.in);

		//load the driver
		try {
			Class.forName("com.mysql.jdbc.driver");

			//get connection

			String dbUrl= "jdbc: mysql://localhost:3306/ust_ty_db";
			String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";
			FileReader reader = new FileReader(filePath);
			Properties prop = new Properties();
			prop.load(reader);
			conn=DriverManager.getConnection(dbUrl,prop);
			System.out.println("hi");

//issue query
			String query = prop.getProperty("sql1");
			ps =conn.prepareStatement(query);
			rs  =  ps.executeQuery(query) ;
			
			while(rs.next()) {
				System.out.println();
			}
		
			





		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

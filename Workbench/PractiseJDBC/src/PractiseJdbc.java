import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class PractiseJdbc {
 
	public static void main(String[] args) {
		Connection  conn= null; 
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			
			//load the driver
		java.sql.Driver div= new Driver();
		DriverManager.registerDriver(div);
		System.out.println("Connection loaded....");
		
		//get connection via driver
		String dbUrl ="jdbc:mySql://localhost:3306/ust_ty_db?user=root&password=root";
		  conn = DriverManager.getConnection(dbUrl);
		  System.out.println("Connection established...");
		  System.out.println("*********");
		
		  //issue SQL queries
		  String query= ("select * from users_info");
		stmt =   conn.createStatement();
		rs = stmt.executeQuery(query);
		
		//process queries
		while(rs.next())
		{
			int userId= rs.getInt("userId");
			String userName=rs.getString("userName");
			String emailId= rs.getString("emailId");
			String password=rs.getString("password");
			System.out.println(userId);
			System.out.println(userName);
			System.out.println(emailId);
			System.out.println(password);
		}
		  
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}

}

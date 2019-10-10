
public class CreateDatabase {

	public static void main(String[] args) {
	
		
	try {
		//load the driver
		Class.forName("com.dev.mysql.jdbc.Driver");
		System.out.println("Connection Loaded.........");
		//get connection
	String dbUrl= "jdbc.mysql://localhost:3306/ust_ty_db";
	System.out.println("");
			
		
		
		
		
	} catch (ClassNotFoundException e) {

		e.printStackTrace();
	}
	
		
	}

}

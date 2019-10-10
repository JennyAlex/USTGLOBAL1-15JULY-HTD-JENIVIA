import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String s= sc.nextLine();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		System.out.println("Select an option......");
		System.out.println("1: Playy song , 2 : Search a song, 3: Show all song name , 4:Operate");

		int n = sc.nextInt();

		switch (n) {

		case 1:

			System.out.println("Select any one option");
			System.out.println(" 1:Play all song , 2:Play all random 3: Play particular song");

			int a = sc.nextInt();
			switch (a) {
			case 1: // sub case of class1

				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");

					System.out.println("Connection loaded...");
					System.out.println("Play a song");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue the query

					String query = "select song_title from musicfiles";
					ps = conn.prepareStatement(query);
					System.out.println("Play  all  Song ");
					//

					rs = ps.executeQuery(query);

					// process the results
					while (rs.next()) {

						String song_title = rs.getString("song_title");

						System.out.println(" Song nAME: " + song_title);

						System.out.println("*******************");
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 2: // subcase of class1

				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");

					System.out.println("Play all random");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue the query

					String query = "select * from musicfiles order by rand() limit 1 ";
					ps = conn.prepareStatement(query);

					rs = ps.executeQuery();

					// process the results
					while (rs.next()) {

						String song_title = rs.getString("song_title");
						System.out.println(song_title);

					}

				} catch (Exception e) {

					e.printStackTrace();
				}

				break;

			case 3: // subcase of class1
				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");

					// System.out.println("Play all");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue the query

					String query ="select * from musicfiles where song_title =?";

					ps = conn.prepareStatement(query);

					System.out.println("Select song name...........");

					String s= sc.next();
			   ps.setString(1, s);

					rs = ps.executeQuery();
				

					// process the results
					while (rs.next()) {

						String song_title = rs.getString("song_title");

						System.out.println("Song name:"  +song_title+ "is playing");

					}

				} catch (Exception e) {

					e.printStackTrace();
				}

			}break;

		case 2:

			try {
				// load the drive
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Search a song");

				// get connection via driver

				String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
				String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

				FileReader reader = new FileReader(filePath);
				Properties prop = new Properties();
				prop.load(reader);

				conn = DriverManager.getConnection(dbUrl, prop);

				// issue the query

				String query ="select * from musicfiles having song_title like 'p%' ";
				ps = conn.prepareStatement(query);

				//

				rs = ps.executeQuery(query);
				// process the results
				while (rs.next()) {

					String song_title = rs.getString("song_title");

					System.out.println(song_title);

					System.out.println("*******************");
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
			break;

		case 3:
			try {
				// load the drive
				Class.forName("com.mysql.jdbc.Driver");

			
				System.out.println("Play a song");

				// get connection via driver

				String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
				String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

				FileReader reader = new FileReader(filePath);
				Properties prop = new Properties();
				prop.load(reader);

				conn = DriverManager.getConnection(dbUrl, prop);

				// issue the query

				String query = "select song_title from musicfiles";
				ps = conn.prepareStatement(query);
				


				

				rs = ps.executeQuery();

				// process the results
				while (rs.next()) {

					String song_title = rs.getString("song_title");
					System.out.println(song_title);

				
			

					System.out.println("*******************");
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
			break;
			

		case 4:
			System.out.println("Select any one Operations");
			System.out.println(" 1: Insert ,2: Delete, 3: Edit");

			int h = sc.nextInt();

			switch (h) {

			case 1:

				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Insert");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue the query

					String query = "Insert into musicfiles values(?,?,?,?,?,?)";

					ps = conn.prepareStatement(query);

					System.out.println("Enter the song id");
					int l = sc.nextInt();

					ps.setInt(1, l);

					System.out.println("Enter the song title");
					sc.nextLine();
					ps.setString(2, sc.nextLine());
					System.out.println("Enter the artist_name");
					ps.setString(3, sc.nextLine());
					System.out.println("Enter the album_name");
					ps.setString(4, sc.nextLine());
					System.out.println("Enter the song song location");
					ps.setString(5, sc.nextLine());
					System.out.println("Enter the description");
					ps.setString(6, sc.nextLine());

					int count = ps.executeUpdate();

					// process the result
					if (count > 0) {
						System.out.println("Query Ok  " + count + " row affected");
					} else {
						System.out.println("Something went wrong");
					}

				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 2:
				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Delete");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue the query

					String query = "Delete from musicfiles  where song_id =?";
					ps = conn.prepareStatement(query);
					System.out.println("Enter the song id id for deletion.....");

					int k = sc.nextInt();
					ps.setInt(1, k);

					int count = ps.executeUpdate();

					// process the results
					if (count > 0) {
						System.out.println("Query ok " +count+ " row affected");
					} else {
						System.out.println("SOmethng went wrong");
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 3:
				try {
					// load the drive
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Edit");

					// get connection via driver

					String dbUrl = "jdbc:mysql://localhost:3306/musicplayer";
					String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

					FileReader reader = new FileReader(filePath);
					Properties prop = new Properties();
					prop.load(reader);

					conn = DriverManager.getConnection(dbUrl, prop);

					// issue query
					String query = "Update musicfiles SET song_title='?'  where song_id=?";
					ps = conn.prepareStatement(query);
					System.out.println("Enter the new song title..");
					ps.setString(1, sc.nextLine());
					sc.nextLine();
					System.out.println("Enter song id");
					int g = sc.nextInt();
					ps.setInt(5, g);

					int count = ps.executeUpdate();

					// process the result

					if (count > 0) {
						System.out.println("Query OK " +count+ "  row affected");

					} else {
						System.out.println("Something went wrong");
					}
				} catch (Exception e) {

					e.printStackTrace();
				}

			}

		}
	}
}

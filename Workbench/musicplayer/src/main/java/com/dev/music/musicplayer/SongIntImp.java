package com.dev.music.musicplayer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

public class SongIntImp implements SongInt {
	static Connection conn = null;

	public void searchSong() {

	}

	public void showAllSong() {

	}

	public void playAllSong() {

	}

	public void playRandomSong() {
		// TODO Auto-generated method stub

	}

	public void playParticularSong() {
		// TODO Auto-generated method stub

	}

	public void addSong() {
		// TODO Auto-generated method stub

	}

	public void editSong() {
		// TODO Auto-generated method stub

	}

	public void deleteSong() {
		// TODO Auto-generated method stub

	}

	public Connection establishConnection() {
		if (conn == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db";
				String filePath = "C:\\Users\\jenny\\OneDrive\\Desktop\\db.properties";

				FileReader reader;

				reader = new FileReader(filePath);
				Properties prop = new Properties();
				prop.load(reader);

			} catch (Exception e) {
			
				e.printStackTrace();
			}

		}
     return conn;
	}

}

package de.isri.es.Editor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Database {
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:sqlserver://10.73.80.4;databaseName=IsriBruster;user=ruben;password=Windows2018";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Database NO connected!!");
		return null;		
	}
	
	
	

}

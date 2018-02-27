package uk.co.reformtheempire.dev.itemtracker.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


import uk.co.reformtheempire.dev.itemtracker.utilities.ApplicationManager;

public class ConnectionManager {
	
	public static int currentConnections;
	
	public static Properties applicationProperties;

	/**
	 * To be called when the application launches. This loads the driver.
	 */
	public static void loadDBDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Cannot load driver. Did you setup your environment correctly?");
			e.printStackTrace();
		}
	}
	

	public static Connection getConnectionToDB() throws SQLException {
		if(applicationProperties == null) {
			applicationProperties = ApplicationManager.getApplicationProperties();
		}
		
		Connection conn = null;
		conn = DriverManager.getConnection(applicationProperties.getProperty("database_url"), applicationProperties.getProperty("username"), applicationProperties.getProperty("password"));
		currentConnections ++;
		if (conn == null) {
			throw new SQLException("Cannot get connection");
		}
		return conn;
	}

	public static boolean closeConnection(Connection conn) {

		try {
			if (!conn.isClosed()) {
				conn.close();
				currentConnections--;
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
}

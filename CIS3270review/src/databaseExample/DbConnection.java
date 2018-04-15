package databaseExample;

import java.sql.*;

public class DbConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// Load driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		try {
		// Connect
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/WrightFlights?useSSL=false", "root", "root");
		System.out.println("DBMS connected");
		try {
			// select query to run
			String str = "select * from Customer";

			// Prepare Statement
			Statement statement = connection.prepareStatement(str);

			// Execute Statement
			ResultSet resultSet = statement.executeQuery(str);

			// Iterate through the result and print the customer name

			while (resultSet.next()) {
				System.out.println(resultSet.getString(4) + "\t" + resultSet.getString(5) + "\t"
						+ resultSet.getString(6) + "\t" + resultSet.getString(2) + "\t");
			}
		} catch (Exception ex) {
		} finally {
			connection.close();
		}
		}catch( Exception ex) {
			
		}
		
		

	}
}

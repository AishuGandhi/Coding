package jdbcconnection;

import java.sql.*;

public class JDBCConnectionExample {
	static final String DB_URL = "jdbc:mysql://localhost/studentdetails";
	static final String USER = "root";
	static final String PASS = "Admin@123";
	static final String QUERY = "SELECT * FROM student";

	public static void main(String[] args) {
		// Open a connection
		try {
			    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				System.out.print("Roll No: " + rs.getInt("roll_no"));
				System.out.print(",Student Name: " + rs.getString("s_name"));
				System.out.print(",Marks: " + rs.getInt("marks"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

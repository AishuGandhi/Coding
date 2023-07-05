package jdbcconnection;

import java.sql.*;

/*
 * 1.Import Package --- java.sql
 * 2.Load and Register Driver
 * 3.Open/Establish Connection
 * 4.Write Statement
 * 5.Execute Statement
 * 6.Process Result
 * 7.Close Connection
 */
public class BookJDBCConnection {

	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/studentdetails", "root", "Admin@123");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from book");
        int result = stmt.executeUpdate("update book set name='' where bookId=");
        System.out.println("Number of records affected :: " + result);
        while(rs.next()) {
			System.out.print("Book Name: " + rs.getInt("name"));
			System.out.print("  Author Name: " + rs.getString("author"));
			System.out.print("  No.Of Pages: " + rs.getInt("noOfPages"));
        }
	}
}

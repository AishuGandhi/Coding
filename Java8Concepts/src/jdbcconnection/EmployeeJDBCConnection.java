package jdbcconnection;

import java.sql.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/*
 *  UI button --> Get all shirts --> On click of button call will come JAVA Code
 *   ---> Java code will get result from database by connecting using JDBC(Java Database Connectivity)
 *   ---> After fetching result JAVA code will return it to UI again
 *   ---> User can see it on screen
 *   
 *   1.import package --> java.sql
 *   2.Load and Register Driver ---> com.mysql.jdbc.Driver
 *   3.Open/Establish Connection ---> getConnection()
 *   4.Statement --> Interface given By Java
 *   5.Execute Statement ---> execute it methods provided by JAVA
 *   6.Process statement ---> Display it to UI/Java Console
 *   7.Close Connection ---> Close connection
 */
public class EmployeeJDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		try {
			// Step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded Successfully!!!");

			// Step 3 jdbc:databasename://IP Address localhost:127.0.0.1 /databasename, username,password
			conn = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "Admin@123");
			System.out.println("Connected to MYSQL Database!!!");

			DatabaseMetaDataDemo.getMetaData(conn);
			
			//by default auto commit is true... To Control Transaction can set it to false and use savePoint,roll back,commit as per need
			conn.setAutoCommit(false);
			
			//Setting savePoint here so can once rollback can come back here
			Savepoint savePoint = conn.setSavepoint();
			
			conn.rollback(savePoint);//rollback till that connection
			conn.commit();
			// Step 4
			Statement stmt = conn.createStatement();

			// Step 5
			ResultSet rs = stmt.executeQuery("select * from employee");

			DatabaseMetaDataDemo.getResultSetMetaData(rs);
	
			System.out.print("Employee Id\tEmpoyee Name\tSalary\n");

			// Step 6
			while (rs.next()) {
				System.out.print(
						rs.getInt("id") + "\t\t" + rs.getString("name") + "\t\t" + rs.getInt("salary") + "\n");
			}

//			// Updating employee through JDBC connnection
//			int result = stmt.executeUpdate("update employee set empname='Aishwarya' where empid='4'");
//			System.out.println("Number of records affected :: " + result);

			// Step 7
			conn.close();

		} catch (SQLException e) {
			conn.rollback();
			System.out.println(e);
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}

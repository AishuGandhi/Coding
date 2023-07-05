package jdbcconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class DatabaseMetaDataDemo {

	public static void getMetaData(Connection c) throws SQLException {
		DatabaseMetaData metaData = (DatabaseMetaData) c.getMetaData();
		System.out.println("MetaData:" + metaData);
		System.out.println("Database Product Version:" + metaData.getDatabaseProductVersion());
		System.out.println("Database Product Name:" + metaData.getDatabaseProductName());
		System.out.println("Catelog:" + c.getCatalog());
		System.out.println("SQL Keywords:" + metaData.getSQLKeywords());
		System.out.println("Does SQL Support outer Joins:" + metaData.supportsFullOuterJoins());
	}

	public static void getResultSetMetaData(ResultSet rs) throws SQLException {
		ResultSetMetaData rsMetaData = rs.getMetaData();
		System.out.println("Column Count:" + rsMetaData.getColumnCount());
		for (int i = 1; i < rsMetaData.getColumnCount(); i++) {
			System.out.println("Column Name:" + rsMetaData.getColumnName(i));
			System.out.println("Column Type:" + rsMetaData.getColumnType(i));
		}
	}
}

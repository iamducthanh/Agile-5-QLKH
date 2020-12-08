package help;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
	static String user = "sa";
	static String password = "123";
	public static Connection Connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=QuanLiKho", user, password);
		return conn;
	}
}

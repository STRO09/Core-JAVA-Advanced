package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdacjdbc?useSSL=false", "root", "tfws.wow///POP()");
		return connection;
		// TODO Auto-generated method stub

	}
}

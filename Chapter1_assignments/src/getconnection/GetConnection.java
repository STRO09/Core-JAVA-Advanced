package getconnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static java.sql.Connection getconnection() {
		java.sql.Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 try {
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb?useSSL=false", "root", "tfws.wow///POP()");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
		// TODO Auto-generated method stub

	}
}

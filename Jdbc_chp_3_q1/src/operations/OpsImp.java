package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connect.GetConnection;

public class OpsImp implements Ops {

	@Override
	public void insertData(int empid, String empname, String contact) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("INSERT INTO empdemojdbc values(?,?,?)");
			preparedStatement.setInt(1, empid);
			preparedStatement.setString(2, empname);
			preparedStatement.setString(3, contact);
			preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteData(int empid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("DELETE from empdemojdbc where empid=?");
			preparedStatement.setInt(1, empid);
			preparedStatement.execute();
			System.out.println("Data Deleted Successfully.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void updateData(int empid, String contact) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("UPDATE empdemojdbc SET contact = ? where empid = ?");

			preparedStatement.setString(1, contact);
			preparedStatement.setInt(2, empid);
			preparedStatement.executeUpdate();
			System.out.println("Data Updated Successfully.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		try {
			Statement statement = GetConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from empdemojdbc");

			System.out.println("Employee Data: ");
			int i = 1;
			while (resultSet.next()) {
				System.out.println(i + ". Emp ID: " + resultSet.getInt("empid") + " - Emp Name: "
						+ resultSet.getString("empname") + " - Contact: " + resultSet.getString("contact"));
				i++;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

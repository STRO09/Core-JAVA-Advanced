package operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connect.GetConnection;
import pojo.Emp;

public class OpsImp implements Ops {

	@Override
	public int insertData(int empid, String empname, String contact) {
		// TODO Auto-generated method stub
		int status = 0;
		try {

			PreparedStatement selectstatement = GetConnection.getConnection()
					.prepareStatement("SELECT * FROM jdbcnoui where LOWER(empname)=? OR contact=? OR empid=?");
			selectstatement.setString(1, empname);
			selectstatement.setString(2, contact);
			selectstatement.setInt(3, empid);
			ResultSet resultSet = selectstatement.executeQuery();

			if (resultSet.next()) {

				System.out.println("Data already exists!");
				return 0;
			}

			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("INSERT INTO jdbcnoui values(?,?,?)");
			preparedStatement.setInt(1, empid);
			preparedStatement.setString(2, empname);
			preparedStatement.setString(3, contact);
			status = preparedStatement.executeUpdate();
			System.out.println("Data inserted successfully");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	@Override
	public int deleteData(int empid) {
		// TODO Auto-generated method stub
		int status = 0;
		try {
			PreparedStatement selectstatement2 = GetConnection.getConnection()
					.prepareStatement("SELECT * FROM jdbcnoui where empid=?");
			selectstatement2.setInt(1, empid);
			ResultSet resultSet = selectstatement2.executeQuery();

			if (resultSet.next()) {
				PreparedStatement preparedStatement = GetConnection.getConnection()
						.prepareStatement("DELETE from jdbcnoui where empid=?");
				preparedStatement.setInt(1, empid);
				status = preparedStatement.executeUpdate();
				System.out.println("Data Deleted Successfully.");
			}
			else {
				System.out.println("No such data exists!");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;

	}

	@Override
	public int updateData(int empid, String empname, String contact) {
		// TODO Auto-generated method stub
		StringBuilder query = new StringBuilder("UPDATE jdbcnoui SET ");
		List<String> fields = new ArrayList<>();
		List<Object> values = new ArrayList<>();
		if (empname != null && !empname.isEmpty()) {
			fields.add("empname = ?");
			values.add(empname);
		}
		if (contact != null && !contact.isEmpty()) {
			fields.add("contact = ?");
			values.add(contact);
		}

		if (fields.isEmpty()) {
			System.out.println("NO data given to update!");
			return 0;
		}

		query.append(String.join(", ", fields));
		query.append(" WHERE empid = ?");
		values.add(empid);

		try (PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement(query.toString())) {
			for (int i = 0; i < values.size(); i++) {
				preparedStatement.setObject(i + 1, values.get(i));
			}

			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Data Updated Successfully.");
				return 1;

			} else {
				System.out.println("No employee found with empid: " + empid);
				return 0;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Emp> showData() {
		List<Emp> employeeList = new ArrayList<>();
		try {
			Statement statement = GetConnection.getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from jdbcnoui");

			while (resultSet.next()) {
				int empid = resultSet.getInt("empid");
				String empname = resultSet.getString("empname");
				String contact = resultSet.getString("contact");

				employeeList.add(new Emp(empid, empname, contact));

				if (employeeList.isEmpty()) {
					System.out.println("No employee records found.");

					JOptionPane.showMessageDialog(null, "No employee records found!");
					return null;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println(employeeList);
		return employeeList;
	}

	@Override
	public Emp searchdata(int empid) {
		// TODO Auto-generated method stub
		Emp emp = null;
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection()
					.prepareStatement("SELECT * from jdbcnoui where empid=?");
			preparedStatement.setInt(1, empid);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				emp = new Emp(resultSet.getInt("empid"), resultSet.getString("empname"),
						resultSet.getString("Contact"));
				System.out.println(emp);
			} else {
				System.out.println("NO such employee found");
				return null;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

}

package displayall;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import home.Home;
import operations.OpsImp;
import pojo.Emp;

public class Display extends JFrame {

	JButton backButton;
	OpsImp imp = new OpsImp();

	public Display() {
		// TODO Auto-generated constructor stub
		setTitle("Displaying Data");
		setSize(400, 350); // Increased height for spacing
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		// Back Button
				backButton = new JButton("⬅️Back");
				backButton.setFont(new Font("SansSerif", Font.PLAIN, 10));
				backButton.setBounds(320, 10, 80, 25); // top-right corner
				add(backButton);

				backButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose(); // close current window
						new Home(); // open home window
					}
				});

				
		// Create table model with column names
		String[] columnNames = { "Emp ID", "Emp Name", "Contact" };
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		JTable table = new JTable(tableModel);

		// Get employee data from OpsImp
		List<Emp> employees = imp.showData();
		if (employees != null) {
			for (Emp emp : employees) {
				Object[] row = { emp.getEmpid(), emp.getEmpname(), emp.getContact() };
				System.out.println(emp.getEmpid() + emp.getEmpname());
				tableModel.addRow(row);
			}
			System.out.println("Employee list size: " + employees.size());

			add(table);
			// Wrap table in scroll pane
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(20, 50, 350, 250);
			add(scrollPane);
		} 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

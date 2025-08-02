package home;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Home extends JFrame {

	JRadioButton male, female, others;
	JButton clickbutton;
	JComboBox<String> devicecomboBox;
	JMenuBar bar;
	JMenu home, doctor, patient, billing, accounts;
	JMenuItem aboutus, services, location, exit, doctorinfo, doctorregister, payment, patientdetails, patientregister,
			gstbill, ngoaccounts, paymentdetails;

	Font labelFont = new Font("SansSerif", Font.BOLD, 15);
	Font fieldFont = new Font("SansSerif", Font.PLAIN, 15);
	Font buttonFont = new Font("Sans", Font.BOLD, 17);

	public Home() {
		// TODO Auto-generated constructor stub
		setTitle("Login");
		setSize(700, 700);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		bar = new JMenuBar();

		home = new JMenu("Home");
		doctor = new JMenu("Doctor");
		patient = new JMenu("Patient");
		accounts = new JMenu("Accounts");
		billing = new JMenu("Billing");

		// Initialize menu items
		aboutus = new JMenuItem("About Us");
		services = new JMenuItem("Services");
		location = new JMenuItem("Location");
		exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});

		doctorinfo = new JMenuItem("Doctor Info");
		doctorregister = new JMenuItem("Doctor Registration");
		payment = new JMenuItem("Payment");

		patientdetails = new JMenuItem("Patient Details");
		patientregister = new JMenuItem("Patient Register");
		gstbill = new JMenuItem("GST Bill");

		ngoaccounts = new JMenuItem("Ngo Accounts");
		paymentdetails = new JMenuItem("Payment Details");

		home.add(aboutus);
		home.add(services);
		home.add(location);
		home.add(exit);

		doctor.add(doctorinfo);
		doctor.add(doctorregister);
		doctor.add(payment);

		patient.add(patientdetails);
		patient.add(billing);
		patient.add(patientregister);

		billing.add(gstbill);

		accounts.add(ngoaccounts);
		accounts.add(paymentdetails);

		bar.add(home);
		bar.add(doctor);
		bar.add(patient);
		bar.add(accounts);

		setJMenuBar(bar);

		String options[] = { "HP", "Mac", "Lenovo", "Dell", "Acer" };
		devicecomboBox = new JComboBox<String>(options);
		devicecomboBox.setBounds(50, 50, 70, 30);

		devicecomboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (devicecomboBox.getSelectedItem() == "HP") {
					JOptionPane.showMessageDialog(null, "Please Leave.");
				} else if (devicecomboBox.getSelectedItem() == "Mac") {
					JOptionPane.showMessageDialog(null, "Richie rich ahh guy");
				} else if (devicecomboBox.getSelectedItem() == "Lenovo") {
					JOptionPane.showMessageDialog(null, "Bro will stay.");
				} else if (devicecomboBox.getSelectedItem() == "Dell") {
					JOptionPane.showMessageDialog(null, "Who invited the boomer");
				} else {
					JOptionPane.showMessageDialog(null, "Mid");
				}
			}
		});

		add(devicecomboBox);

		male = new JRadioButton("Male");
		male.setBounds(50, 100, 100, 50);
		female = new JRadioButton("Female");
		female.setBounds(50, 130, 100, 50);
		others = new JRadioButton("Others");
		others.setBounds(50, 160, 100, 50);

		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		group.add(others);

		add(male);
		add(female);
		add(others);

		clickbutton = new JButton("Submit");
		clickbutton.setFont(buttonFont);
		clickbutton.setBounds(50, 250, 150, 30);

		clickbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (male.isSelected()) {
					JOptionPane.showMessageDialog(null, "My bro🫂");
				} else if (female.isSelected()) {
					JOptionPane.showMessageDialog(null, "Quit programming");
				} else {
					JOptionPane.showMessageDialog(null, "ew");
				}
			}
		});

		add(clickbutton);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

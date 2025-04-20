package main;

import operations.OpsImp;

public class Main {
public static void main(String[] args) {
	OpsImp imp = new OpsImp();
	imp.insertData(54, "Sagar", "9699432854");
	imp.insertData(53, "Sonu", "9004636022");
	imp.insertData(52, "Prajwal", "9281305512");
	imp.insertData(55, "Aditri", "9002124353");
	imp.showData();
	
	imp.updateData(54, "9004636011");
	imp.showData();
	
	imp.deleteData(53);
	imp.showData();
}
}

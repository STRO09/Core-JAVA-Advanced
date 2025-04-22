package main;


import operations.OpsImp;

public class Main {
	
public static void main(String[] args) {
	OpsImp imp = new OpsImp();
//	imp.insertData(54, "Sagar", "9699432854");
//	imp.insertData(55, "Aditri", "9463523666");
//	imp.insertData(39, "Rajan", "9231305676");
//	imp.insertData(38, "Hari", "9023510035");
	
	imp.updateData(38, "Harikrushna", null);
	imp.searchdata(38);
	imp.updateData(38, "Hari", "9023510038");
	imp.showData();
//	imp.deleteData(55);
//	imp.searchdata(55);
//	imp.showData();
//	imp.searchdata(38);
	
	
	
	
	

}
}

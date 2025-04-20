package operations;

public interface Ops {

	void insertData(int empid, String empname, String contact);

	void deleteData(int empid);

	void updateData(int empid, String contact);

	void showData();

}

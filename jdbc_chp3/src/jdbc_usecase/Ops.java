package jdbc_usecase;

public interface Ops {

	void insertData(Emp emp);

	void deleteData(int empid);

	void updateData(int empid, double salary);

	void showData();

}

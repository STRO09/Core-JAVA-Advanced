package operations;

import java.util.List;

import pojo.Emp;

public interface Ops {

	int insertData(int empid, String empname, String contact);

	int deleteData(int empid);

	int updateData(int empid,String empname, String contact);

	List<Emp> showData();

	public Emp searchdata(int empid);

}

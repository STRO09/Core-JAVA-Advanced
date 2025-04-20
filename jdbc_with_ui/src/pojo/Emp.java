package pojo;

public class Emp {

	private int empid;
	private String empname;
	private String contact;

	public Emp(int empid, String empname, String contact) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.contact = contact;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


}

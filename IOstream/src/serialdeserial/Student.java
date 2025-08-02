package serialdeserial;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	String subject;
	int marks;

	public Student(int id, String name, String subject, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}

}

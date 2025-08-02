package serialdeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) {
	
	Student student =new Student(54, "Sagar", "BDA", 27);
	
	try {
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Sagar\\Documents\\Projects\\file.txt"));
//		objectOutputStream.writeObject(student);
//		objectOutputStream.flush();
//		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Sagar\\Documents\\Projects\\file.txt"));
		try {
			Student inobj = (Student)inputStream.readObject();
			System.out.println(inobj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputStream.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

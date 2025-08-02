package serialdeserial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {
public static void main(String[] args) {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter your number: ");
	try {
//		int a=  bufferedReader.read();
//		System.out.println("Oh yes ofc you chose "+a);
//		RETURNS ASCII VALUE
		String line = bufferedReader.readLine();
		int a = Integer.parseInt(line);
		System.out.println("Oh yes ofc you chose "+a);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

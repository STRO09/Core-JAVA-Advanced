package thread_priority;


class Mythread1 extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Thread 1 is running");
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 1 "+i);
		}
	}
}

class Mythread2 extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Thread 2 is running");
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 2 "+i);
		}
	}
}

class Mythread3 extends Thread {

	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Thread 3 is running");
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 3 "+i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Mythread1 mythread1 = new Mythread1();
		Mythread2 mythread2 = new Mythread2();
		Mythread3 mythread3 = new Mythread3();

		mythread1.setPriority(3);
		mythread2.setPriority(1);
		mythread3.setPriority(2);

		mythread1.start();
		mythread2.start();
		mythread3.start();
	}
}

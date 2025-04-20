package thread_ways_to_creatw;

class Mythread1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 is running...");
	}
}

class Mythread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 is running...");
	}

}

public class Main {
public static void main(String[] args) {
	Mythread1 mythread1 = new Mythread1();
	mythread1.start();
	Mythread2 mythread2 = new Mythread2();
	Thread threadrunnable = new Thread(mythread2);
	
	threadrunnable.start();
	
	new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous class Thread  is running...");
		}
	}.start();
	
	new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("Anonymous Runnable class passed as parameter to thread object is running...");
		}	
	}).start();
	
	
}
}

package thread_sleep;

class MYthread1 extends Thread{
	public void run() {
		// TODO Auto-generated constructor stub
		System.out.println("Thread1 has now started..");
		try {
			System.out.println("Thread now going to sleep...");
			sleep(5000);
			System.out.println("Thread now running.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Main {
public static void main(String[] args) {
	MYthread1 mYthread1 = new MYthread1();
	mYthread1.start();

}
}

package thread_rename;

class Mythread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name:"+currentThread().getName());
		setName("ChangedName");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Updated Name:"+currentThread().getName());
	}
}
public class Main {
public static void main(String[] args) {
	Mythread1 mythread1 = new Mythread1();
	mythread1.start();
}
}

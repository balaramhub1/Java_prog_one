package java_threads;

public class ThreadOne {

	public static void main(String[] args) {

		// Thread in working Demo
		
		// System.out.println("Hello there...");

		// Get the Thread Name to identify the output
		
		Task t1=new Task();
		System.out.println("Starting Thread One");
		
		// Renaming the Tread from outside the Class implementing Thread.
		t1.setName("Thread-A");
		t1.start();
		
		System.out.println("Hello there...");
		
		Task t2=new Task();
		System.out.println("Starting Thread Two");
		t2.setName("Thread-B");
		t2.start();
	}

}

class Task extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			
			System.out.println(Thread.currentThread().getName()+" - Value of i is : "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
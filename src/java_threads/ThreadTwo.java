package java_threads;

public class ThreadTwo {

	public static void main(String[] args) {

		// Giving Names to Thread.
		// Get the Thread Name to identify the output
		
		NewTask t1=new NewTask("FirstThread");
		System.out.println("Starting Thread One");
		t1.start();
		
		System.out.println("Hello there...");
		
		NewTask t2=new NewTask("SecondThread");
		System.out.println("Starting Thread Two");
		t2.start();
	}

}

class NewTask extends Thread{
	String name;
	public NewTask(String name) {
		this.name=name;
	}
	public void run() {
		Thread.currentThread().setName(name);
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
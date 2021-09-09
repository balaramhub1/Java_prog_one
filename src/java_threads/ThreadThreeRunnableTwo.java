package java_threads;

public class ThreadThreeRunnableTwo {

	public static void main(String[] args) {

		// Creating Thread by implementing Runnable interface.
		
		ATask task1=new ATask("FirstThread");
		System.out.println("Starting Thread One");
		Thread th1=new Thread(task1);
		th1.start();
		
		System.out.println("Hello there...");
		
		ATask task2=new ATask("SecondThread");
		System.out.println("Starting Thread Two");
		Thread th2=new Thread(task2);
		th2.start();
	}

}

class ATask implements Runnable{
	String name;
	public ATask(String name) {
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
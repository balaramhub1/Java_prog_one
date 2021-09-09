package java_threads;

public class ThreadThreeRunnable {

	public static void main(String[] args) {

		// Creating Thread by implementing Runnable interface.
		// Create Thread using Anonymous Class
		// Cannot set the Thread Name while we use Anonymous Class.
		
		System.out.println("Starting Thread One");
		Thread th1=new Thread(new Runnable() {

			@Override
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
			
		});
		th1.start();
		
		System.out.println("Hello there...");
		
		System.out.println("Starting Thread Two");
		Thread th2=new Thread(new Runnable() {

			@Override
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
			
		});
		th2.start();
	}

}

/*class ATask implements Runnable{
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
}*/
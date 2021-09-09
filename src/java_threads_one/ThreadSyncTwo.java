package java_threads_one;

public class ThreadSyncTwo {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager manager=new InventoryManager();
		
		Thread inventoryTask=new Thread(new Runnable() {

			@Override
			public void run() {

				manager.populateSoldProducts();
			}
			
		});
		
		Thread displayTask=new Thread(new Runnable() {

			@Override
			public void run() {

				manager.displaySoldProducts();
			}
			
		});
		
		inventoryTask.start();
		//	 inventoryTask.join();
		// the main thread waits till inventoryTask thread is completed,
		// this makes the program in -sequence , but not multi-threaded.
		displayTask.start();
		
	}

}

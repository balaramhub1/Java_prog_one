package java_threads;

public class ThreadSyncOne {

	public static void main(String[] args) {

		Sequence seq1=new Sequence();
		Worker worker1=new Worker(seq1);
		worker1.start();
		
		Worker worker2=new Worker(seq1);
		worker2.start();
		
	}

}

class Worker extends Thread{
	Sequence seq=null;
	public Worker(Sequence seq) {
		this.seq=seq;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+"got Value : "+seq.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

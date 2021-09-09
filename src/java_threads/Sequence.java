package java_threads;

public class Sequence {

	private int value = 0;

	// While running threads, the same value may be returned to multiple threads.
	// to avoid that we need to synchronize the code block.

	// We can also synchronize the method ;

/*	public int getNext() {

		synchronized (this) {
			value++;
			return value;
		}
	}*/

	public synchronized int getNext() {

			value++;
			return value;
	}

}

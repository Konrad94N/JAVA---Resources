package Threads;


public class SysOutTest {
	
	//2) public synchronized void print(String name)
	public void print(String name) {
		//3) synchronized(this){...}
		for(int i=0; i<10; i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FINISHED!");
	}
}


/*
 * There are two ways of creating Threads - to implement a Runnable interface (which I will use) or to extend a Thread.
 * Every method requires a Thread and a Thread name (String) as elements in our class. 
 * "run()" method - it contains instructions to be done when the Thread starts
 * "start()" method - we might use it to fire a Thread and the "run()" method when we EXTEND a Thread
 */

public class MyThread extends Thread{
	String name;
	SysOutTest output;

	public MyThread(String name, SysOutTest out) {
		this.name=name;
		output=out;
	}
	
	/*
	 * Synchronized is the basic element to run the Threads one after 
	 * another, instead of running them simultaneously.
	 * 
	 * Synchronized element might be applied in three different ways:
	 * 1) Below --> synchronized(ObjectWeSYnchronizeBy)
	 * 2) As a part of a method: public synchronized void ... (watch: SysOutTest class)
	 * 3) synchronized(this) <-- Inside Synchronization Object (watch: SysOutTest class)
	 * 
	 * WATCH OUT! It look like synchronization doesn't really work with 
	 * implemented Runnable - might need further investigation
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//1)
		synchronized(output) {
			output.print(name);
		}
	}

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SysOutTest output = new SysOutTest();
		MyThread thread1 = new MyThread("Kalmi",output);
		MyThread thread2 = new MyThread("Banjo",output);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



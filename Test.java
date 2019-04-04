package Threads;

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

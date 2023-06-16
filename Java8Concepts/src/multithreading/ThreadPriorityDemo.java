package multithreading;

class MyThread extends Thread {

	public void run() {
		System.out.println("Inside run method " + Thread.currentThread().getName());
	}
}

public class ThreadPriorityDemo {
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		//Current Thread Priority
		System.out.println("T1 Thread priority is " + t1.getPriority());
		System.out.println("T2 Thread priority is " + t2.getPriority());
		System.out.println("T3 Thread priority is " + t3.getPriority());

		t1.setPriority(3);//--2
		t2.setPriority(Thread.MIN_PRIORITY);//Lowest priority --3
		t3.setPriority(Thread.MAX_PRIORITY);// 1
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");

		System.out.println("T1 Thread priority is " + t1.getPriority());
		System.out.println("T2 Thread priority is " + t2.getPriority());
		System.out.println("T3 Thread priority is " + t3.getPriority());

		System.out.println("Current Thread is " + Thread.currentThread().getName());
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}

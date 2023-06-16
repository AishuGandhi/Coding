

class CounterThread 
{
	int counter = 0;
	public void increment() {
		counter ++;
	}
}
class MyThread1 extends Thread
{
	CounterThread counter = new CounterThread();
	public void run() {
		counter.increment();
	}
}
class MyThread2 implements Runnable
{
	CounterThread counter = new CounterThread();
	public void run() {
		counter.increment();
	}
}
public class MultithreadingDemo {

	public static void main(String[] args) {
		CounterThread counter = new CounterThread();
		MyThread1 t1 = new MyThread1();
		Thread t2 = new Thread(new MyThread2());
		
		t1.start();
		t2.start();
		System.out.println(counter.counter);
	}

}

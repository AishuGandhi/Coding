package multithreading;

class DemoThread extends Thread {

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Inside run method " + t.getName());
	}
}

public class ThreadMethods {

	public static void main(String[] args) throws InterruptedException {
		DemoThread t1 = new DemoThread();
		DemoThread t2 = new DemoThread();
		
		t1.start();
		try {
			System.out.println("Check if thread t2 is alive:" +t2.isAlive());
			t2.sleep(3000);//ms time
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		t2.start();
		System.out.println("Check if thread t2 is alive:" +t2.isAlive());
		System.out.println("T2 thread Id and Name:"+t2.getId()+" "+t2.getName());
		System.out.println("T2 State is:"+t2.getState());
		System.out.println("T2 State is:"+t2.getPriority());
	
	}

}

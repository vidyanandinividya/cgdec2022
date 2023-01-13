package session9;

public class MultithreadingRunnable  implements Runnable {

	public static void main(String[] args) {
		MultithreadingRunnable obj=new MultithreadingRunnable();
		MultithreadingRunnable obj1=new MultithreadingRunnable();
		MultithreadingRunnable obj2=new MultithreadingRunnable();
		Thread t=new Thread(obj);
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t.start();
		t.setName("Thread 1");
		//t1.start();
		//t2.start();
		System.out.println(t.getName());
		//System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());

	}

	@Override
	public void run() {
		for(int i=1;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

	

}

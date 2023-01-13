package session9;

public class ThreadJoinMethod extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		ThreadJoinMethod th1=new ThreadJoinMethod();
		ThreadJoinMethod th2=new ThreadJoinMethod();
		ThreadJoinMethod th3=new ThreadJoinMethod();
		th1.start();
		try {
			th1.join();
			//th1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		th3.start();

	}

}

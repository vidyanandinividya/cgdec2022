package session9;

public class Multithreading extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Multithreading obj=new Multithreading();
		obj.start();

	}

}

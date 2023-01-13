package session9;
class Printer
{
	//synchronized void printDocument(int numOfCopies, String docName)
	void printDocument(int numOfCopies, String docName)
	{
		for(int i=1;i<numOfCopies;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing "+ docName +" "+ i);
		}
	}
}
class MyThread extends Thread
{
	Printer pRef;
	MyThread(Printer p)
	{
		pRef=p;
	}
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDocument(5, "Doc1");
		}
		
	}
}
class YourThread extends Thread
{
	Printer pRef;
	YourThread(Printer p)
	{
		pRef=p;
	}
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDocument(5, "Doc1");
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		Printer printer=new Printer();
		MyThread mThread=new MyThread(printer);
		YourThread yThread=new YourThread(printer);
		mThread.start();
		yThread.start();

	}

}

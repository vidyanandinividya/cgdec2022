package session9;

public class Library implements Runnable{
	
	//List of books available
	String[] books= {"Introduction to Java","Design Patterns","Head first java","Introduction to Java","Multithreading and concurrency","Introduction to Java"};
	//details for counting books
	static String bookName="Introduction to Java";
	static int count=0;
	@Override
	public void run() {
		for(int i=0;i<books.length;i++)
		{
			if(books[i].equals(bookName))
			{
				count++;
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Library lib1=new Library();
		Person p1=new Person();
		Thread bookCount=new Thread(lib1);
		Thread details=new Thread(p1);
		
		details.start();
		bookCount.start();
		while(details.isAlive());
		
			System.out.println("Server 2: There are "+ count + "copies of  the book "+ bookName);
		
	}

}

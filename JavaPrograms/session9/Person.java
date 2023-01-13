package session9;

import java.util.Scanner;

public class Person  implements Runnable{
	static int id;
	static String name;
	static String issuedBook;
	public static void putInfo(String n, String book)
	{
		name=n;
		issuedBook=book;
	}
	public static void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter issuedBook");
		String book=sc.next();
		putInfo(name, book);
		System.out.println("Server 1: you have registered");
	}
	@Override
	public void run() {
		getDetails();
		
	}
}

package session1;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("My name is: "+name);
		int num1=sc.nextInt();
		System.out.println("num1 value is: "+ num1);
		float salary=sc.nextFloat();
		System.out.println("Salary is: "+ salary);
		char ch=sc.next().charAt(0);
		System.out.println(ch);

	}

}

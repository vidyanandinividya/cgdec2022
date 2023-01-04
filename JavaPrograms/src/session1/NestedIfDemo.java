package session1;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int marks=sc.nextInt();
		if(age>18)
		{
			if(marks>600)
			{
				System.out.println("CSE");
			}
			else if(marks>450)
			{
				System.out.println("ECE");
			}
			else if(marks>300)
			{
				System.out.println("EEE");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("age of the person must be above 18");
		}

	}

}

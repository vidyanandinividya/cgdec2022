package session6;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	public void calculation() throws ArithmeticException
	{
		System.out.println("Enter num1");
		int num1=sc.nextInt();
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		System.out.println("Result :"+num1/num2);
		
	}
	public void checkNum(int num) throws ArithmeticException
	{
		if(num<0)
		{
			throw new ArithmeticException("The number is negative");
		}
		else
		{
			System.out.println("The number is positive");
		}
		
	}

}

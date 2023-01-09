package session6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number");
		try
		{
		int num=sc.nextInt();
		System.out.println("The value of num:"+num);
		
		}
		catch(InputMismatchException ime)
		{
			System.out.println(ime.getMessage());
			System.out.println("The value shoulb be entered as integer");
		}
		
		catch(Exception ime)
		{
			System.out.println(ime.getMessage());
			System.out.println("The value shoulb be entered as integer");
		}
		finally
		{
			System.out.println("Free resource");
		}
		try
		{
		int a[]=new int[] {10,20,30};
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println(aiob.getMessage());
			System.out.println("Array Index out of bound exception occurs");
		}
		
		

	}

}

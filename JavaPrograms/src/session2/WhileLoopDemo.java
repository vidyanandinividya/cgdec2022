package session2;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String []args)
	{
		/*int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}*/
		/*while(true)
		{
			System.out.println("Hello world");
		}*/
	//Take integer inputs from the user until user presses q(quit).
	//print average and product of all numbers
		String choice="";
		int sum=0,product=1,count=0;
		Scanner sc=new Scanner(System.in);
		while(!choice.equalsIgnoreCase("q"))
		{
			System.out.println("Enter a number or q to quit");
			choice=sc.next();
			if(!choice.equalsIgnoreCase("q"))
			{
				int number=Integer.parseInt(choice);
				sum+=number;
				product*=number;
				count++;
			}
		}
		System.out.println("Product is:" +product+"\nAverage is:"
		+((float)sum/count));
	}
}

package session2;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do
		{
			//Take numbers as input
			System.out.println("Enter First Number");
			int first=sc.nextInt();
			System.out.println("Enter Second Number");
			int second=sc.nextInt();
			//print the choice list
			System.out.println("Enter your choice \n1 "
					+ "Add\n2 Subtraction\n3 Multiply\n4 Divide");
			switch(sc.nextInt())
			{
			case 1:
				first+=second;
				break;
			case 2:
				first-=second;
				break;
			case 3:
				first*=second;
				break;
			case 4:
				if(second!=0)
				{
				first/=second;
				}
				else
				{
					System.out.println("The second value must not be zero");
				}
				break;
			}
			System.out.println("Result is :"+first);
			System.out.println("To continue enter 1, to exit enter 0");
		}while(1==sc.nextInt());//test expression

	}

}

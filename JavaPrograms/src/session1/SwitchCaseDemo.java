package session1;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		//print message based on the grade of a student
		Scanner sc=new Scanner(System.in);
		char grade=sc.next().charAt(0);
		/*if(grade=='A' || grade=='a')
		{
			System.out.println("Excellent");
		}
		else if(grade=='B' || grade=='b')
		{
			System.out.println("Good");
		}

		else if(grade=='C' || grade=='c')
		{
			System.out.println("can do better");
		}
		else if(grade=='D' || grade=='d')
		{
			System.out.println("Just Passed");
		}
		else if(grade=='F' || grade=='f')
		{
			System.out.println("You Failed");
		}
		else
		{
			System.out.println("Invalid Grade");
		}*/
		switch(grade)
		{
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Good");
			break;
		case 'C':
		case 'c':
			System.out.println("can do better");
			break;
		case 'D':
		case 'd':
			System.out.println("Just Passed");
			break;
		case 'F':
		case 'f':
			System.out.println("You Failed");
			break;
		default:
			System.out.println("Invalid Grade");
			
		}

		

	}

}

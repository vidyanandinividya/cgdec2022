package session2;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//one dimensional Array
		/*int marks[]=new int[5];
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the element");
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
			
		}
		for(int i:marks)
		{
			sum+=i;
			System.out.print(i+"\t");
			
		}
		System.out.println(sum);*/
		//Two-dimensional Array
		
		int marks[][]=new int[3][5];
		for(int i=0;i<marks.length;i++) //for number of rows
		{
			for(int j=0;j<marks[i].length;j++) //for number of columns
			{
				marks[i][j]=sc.nextInt();
			}
		}
		//print the array elements in  matrix format
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

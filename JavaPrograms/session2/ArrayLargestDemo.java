package session2;

public class ArrayLargestDemo {

	public static void main(String[] args) {
		int []arr=new int[] {3,4,56,34,79};
		findLargestAndSecondLargestElementArray(arr);

	}
	public static void findLargestAndSecondLargestElementArray(int[] arr)
	{
		if(arr==null || arr.length<2)
		{
			System.out.println("Invalid Input");
			return;
		}
		int max=arr[0];
		int secondmax=arr[0];
		for(int value:arr)
		{
			if(value>max)
			{
				secondmax=max;
				max=value;
			}
			else if(max==secondmax)
			{
				secondmax=value;
			}
		}
		if(secondmax==max)
		{
			System.out.println("Largest Element:" + max);
			System.out.println("Second Largest number not found");
		}
		else
		{
			System.out.println("Largest Elemenet:" +max);
			System.out.println("Second Largest Element :"+ secondmax);
		}
	}
	

}

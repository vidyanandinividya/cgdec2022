package session2;

import java.util.Arrays;

public class ArrayUtilDemo {

	public static void main(String[] args) {
		int arr[]= {10,3,56,74,6};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		int key=56;
		System.out.println();
		System.out.println(key+"found at index"+
		Arrays.binarySearch(arr, key));
		int arr1[]= {10,20,11,21,31};
		System.out.println("Integer Array is:"+
		Arrays.toString(
		Arrays.copyOf(arr1, 7)));
		System.out.println("Integer Array is:"+
				Arrays.toString(
				Arrays.copyOfRange(arr1, 2,5)));
		System.out.println("Arrays on comparision:"+
				Arrays.equals(arr, arr1));
		int value=45;
		Arrays.fill(arr1, value);
		System.out.println("New Array:"+Arrays.toString(arr1));
	
		
	}

}

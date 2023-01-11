package session8;

import java.util.Arrays;

@FunctionalInterface
interface Display
{
	void display(String s);
}

public class MethodReferenceDemo {

	public MethodReferenceDemo()
	{
		
	}
	public MethodReferenceDemo(String str)
	{
		System.out.println(str);
	}
	public void myMethod()
	{
		System.out.println("method reference in java 8");
	}
	public static void main(String[] args) {
		MethodReferenceDemo obj=new MethodReferenceDemo();
		//Reference to the method using object of the class
		//Display ref=obj::myMethod;
		//calling the method inside the functional interface 
		//ref.display();
		String[] arr= {"Nisha","Suman","Amish","Amisha","Esha"};
		Arrays.sort(arr,String::compareToIgnoreCase);
		for(String str:arr)
		{
			System.out.println(str);
		}
		//Method reference to a constructor
		Display ref1=MethodReferenceDemo::new;
		ref1.display("Hello World");

	}

}

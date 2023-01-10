package session7.collections;

import java.util.Arrays;
import java.util.Iterator;

class MyList<Type>
{
	private Type[] values;
	private int firstIndex;
	public MyList()
	{
		this.values=(Type[]) new Object[10];
		this.firstIndex=0;
	}
	public void add(Type value)
	{
		if(this.firstIndex==this.values.length)
		{
			grow();
		}
		this.values[this.firstIndex]=value;
		this.firstIndex++; 
	}
	@Override
	public String toString() {
		return "MyList [values=" + Arrays.toString(values) + ", firstIndex=" + firstIndex + "]";
	}
	
	private void grow()
	{
		int newSize=this.values.length+this.values.length/2;
		Type[] newValues=(Type[]) new Object[newSize];
		for(int i=0;i<this.values.length;i++)
		{
			newValues[i]=this.values[i];
			
		}
		this.values=newValues;
		
	}
	
}

public class ListDemo {

	public static void main(String[] args) {
		MyList<String> myList=new MyList<>();
		myList.add("hello");
		myList.add("world");
		System.out.println(myList);
		//myList.forEach(System.out::println);
		MyList<Integer> myList1=new MyList();
		for(int i=0;i<11;i++)
		{
			myList1.add(i+1);
		}
		System.out.println(myList1);
		

	}

}

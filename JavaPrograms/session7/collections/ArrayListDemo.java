package session7.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		//creating an ArrayList
		ArrayList<String> str=new ArrayList<String>();
		//displaying the initial size
		System.out.println("size at the begining:"+str.size());
		//add elements
		str.add("Hello");
		str.add("Hi");
		str.add("Namaste");
		str.add("Hola");
		//displaying the ArrayList
		System.out.println(str);
		//displaying the size
		System.out.println("Size after addition: "+str.size());
		
		//remove element at index 0
		str.remove(0);
		//displaying the new ArrayList
		System.out.println(str);
		//displaying the new size
		System.out.println("Size after removal "+str.size());
		
		

	}

}

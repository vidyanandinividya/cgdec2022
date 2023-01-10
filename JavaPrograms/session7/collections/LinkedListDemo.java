package session7.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//creating an LinkedList
				LinkedList<String> str=new LinkedList<String>();
				//displaying the initial size
				System.out.println("size at the begining:"+str.size());
				//add elements
				str.add("Hello");
				str.add("Hi");
				str.add("Namaste");
				str.add("Hola");
				str.add(2,"Bonjour");
				//displaying the ArrayList
				System.out.println(str);
				//displaying the size
				System.out.println("Size after addition: "+str.size());
				
				//remove element at index 0
				str.remove(0);
				str.remove("Hi");
				//displaying the new ArrayList
				System.out.println(str);
				//displaying the new size
				System.out.println("Size after removal "+str.size());

	}

}

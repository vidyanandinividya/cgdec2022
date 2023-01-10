package session7.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//creating a stack
		Stack<Integer> stack=new Stack<>();
		//Displaying the initial size
		System.out.println("The initial size:"+stack.size());
		//push the elements
		stack.push(99);
		stack.push(28);
		stack.push(17);
		stack.push(74);
		stack.push(1);
		//displaying the stack
		System.out.println("New Stack:"+stack);
		System.out.println("New size:" +stack.size());
		System.out.println("popped element:"+stack.pop());
		System.out.println("New stack after popping:"+stack);
		System.out.println("Top most elements:"+stack.peek());
		//for loop
		for(int i=0;i<stack.size();i++)
		{
			System.out.println(stack.get(i));
		}
		//for each loop
		for(Integer element:stack)
		{
			System.out.println(element);
		}
		//Iterator interface
		Iterator<Integer> it=stack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//method reference
		stack.forEach(System.out::println);
		//lambda expression
		stack.forEach(element->System.out.println());
	}

}

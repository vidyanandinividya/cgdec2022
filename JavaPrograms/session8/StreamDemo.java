package session8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamDemo {

	/*iterate over a list of integers and find out the sum of
	 * all the integers greater than 10
	 */
	static int sumIterator(List<Integer> list)
	{
		Iterator<Integer> iterator=list.iterator();
		int sum=0;
		while(iterator.hasNext()) //external iteration
		{
			int num=iterator.next();
			if(num>10)
			{
				sum+=num;
			}
		}
		return sum;
	}
	static int sumStream(List<Integer> list)
	{
		return list.stream().filter(i->i>10).mapToInt(i->i).sum();
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(20,10,15,3,5);
		System.out.println(StreamDemo.sumIterator(list));
		System.out.println(StreamDemo.sumStream(list));
		

	}

}

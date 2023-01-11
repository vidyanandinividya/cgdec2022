package session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

//ways to create stream
public class StreamExample {

	public static void main(String[] args) {
		//Stream.of() - create a stream of a fixed number of same type elements
		Stream<Integer> stream=Stream.of(2,3,4,5,6,8);
		//stream.forEach(element->System.out.println(element));
		//stream.forEach(System.out::println);
		//stream.of(array) -with an array of objects
		Stream<Integer> stream1=Stream.of(new Integer[] {3,4,5,6,8});
		//stream1.forEach(System.out::println);
		//List.stream() - with the list of elements
		List<Integer> list =new ArrayList<>();
		for(int i=1;i<10;i++)
		{
			list.add(i);
		}
		//Sequential Stream
		Stream<Integer> seqStream=list.stream();
		//seqStream.forEach(System.out::println);
		//Parallel Stream
		Stream<Integer> parlStream=list.parallelStream();
		//parlStream.forEach(System.out::println);
		//Stream.generate()
		Stream<String> stream2=Stream.generate(()->{return "abc"; });
		Stream<Integer> randomNumbers=Stream.generate(
				()->new Random().nextInt(100));
		randomNumbers.limit(5).forEach(System.out::println);
				
	}

}

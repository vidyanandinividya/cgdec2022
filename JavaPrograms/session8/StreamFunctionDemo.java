package session8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("john","james","mathew","cielo","andrew","brian","jack");
		//show the names which start with letter "j" 
		//and convert the names into uppercase
		//and display the sorted stream
		names.stream().filter(s->s.startsWith("j"))
						.map(String::toUpperCase)
						.sorted()
						.forEach(System.out::println);
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*Stream<Integer> stream=list.stream();
		List<Integer> evenNumbers;
		evenNumbers=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);*/
		List<Integer> evenNumbers=list.stream()
				.filter(i->i%2==0).collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);
		
		Integer[] evenNumberArr=list.stream()
				.filter(i->i%2==0).toArray(Integer[]::new);
		System.out.println(Arrays.toString(evenNumberArr));
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8);	
		Optional<Integer> intOptional=list1.stream()
				.filter(i->i%2==0)
				.reduce((i,j)->{return i+j;});
		if(intOptional.isPresent())
		{
		System.out.println(intOptional.get());
		}
		System.out.println(list.stream().count());
		boolean matchResult=names.stream()
				.anyMatch(s->s.startsWith("a"));
		System.out.println(matchResult);
		boolean matchResult1=names.stream()
				.allMatch(s->s.startsWith("a"));
		System.out.println(matchResult1);
		boolean matchResult2=names.stream()
				.noneMatch(s->s.startsWith("e"));
		System.out.println(matchResult2);
		System.out.println(names.stream().filter(s->s.startsWith("j"))
		.sorted().findFirst().get());;
				
		
		
		
	}

}

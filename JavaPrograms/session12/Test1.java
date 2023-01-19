package session12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
	
	public static void main(String[] args) {
	 Stream<String> names=Stream.of("Hello","Hi","Welcome","Lilly","Hello");
	 List<String> list=names.filter(x->x.contains("l")).distinct()
			 .collect(Collectors.toList());
	 list.forEach(System.out::println);
	 
	 boolean result=Stream.of("do","re","mi","fa","so","la","ti","abcdef")
			 .filter(str->str.length()>5)  //1
			 .peek(System.out::println) //2
			 .allMatch(str->str.length()>5); //3
	 System.out.println(result);
	 
	 IntStream.range(1, 10)
	 			.filter(i->{
	 				System.out.print("1");
	 				return i%2==0; //false
	 			})
	 			.filter(i->{
	 				System.out.print("0");
	 				return i>3; //false
	 			})
	 			.limit(1)
	 			.forEach(i->{
	 				System.out.print(i);
	 			});
	 Stream.of("eeny","meeny",null).forEach(Test1::toUpper);
	}
	private static void toUpper(String str)
	{
		Optional<String> string=Optional.ofNullable(str);
		System.out.println(string.map(String::toUpperCase).orElse("dummy"));
	}
	
	
}

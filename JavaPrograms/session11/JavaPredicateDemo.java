package session11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaPredicateDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("A","Abc","ccc","AAA","ABCD","Bcd");
		System.out.println(Demo.filter1(list,x->x.startsWith("A")));
		System.out.println(Demo.filter1(list,x->x.startsWith("A")&& x.length()==3));
		
	}

}
class Demo
{
	static List<String> filter1(List<String> list,Predicate<String> predicate)
	{
		return list.stream().filter(predicate::test).collect(Collectors.toList());
	}
}

package session7.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>();
		set.add("India");
		set.add("America");
		set.add("Japan");
		set.add("Britain");
		System.out.println(set);
		set.add("Japan");
		System.out.println(set);

	}

}

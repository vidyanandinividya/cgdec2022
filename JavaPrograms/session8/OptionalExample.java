package session8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> name=Optional.of("India");
		String op1="Yes";
		String op2=null;
		/*System.out.println("Non-empty optional: "+name);
		System.out.println("Non empty optional : name value "+name.get());
		System.out.println("Empty optional: "+Optional.empty());
		System.out.println("ofNullable on non-empty optioanl: "+Optional.ofNullable(op1));
		System.out.println("ofNullable on empty optioanl: "+Optional.ofNullable(op2));
		System.out.println("ofNullable on non-empty optioanl: "+Optional.of(op2));*/
		Optional<String> emptyName=Optional.empty();
		System.out.println(name.filter(n->n.equals("india")));
		System.out.println(name.filter(n->n.equalsIgnoreCase("India")));
		System.out.println(emptyName.filter(n->n.equalsIgnoreCase("india")));
		
		

	}

}

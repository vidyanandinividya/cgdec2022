package session8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyInter
{
	//void MyInterMethod();
	//void add(int a,int b);
	int calc(int a,int b);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		//without Lambda Expression
		/*MyInter person=new MyInter() {
			
			@Override
			public void MyInterMethod() {
				System.out.println("Before Java 8 without Lambda");
				
			}
		};
		person.MyInterMethod();
		//with Lambda Expression
		MyInter p1=()->{System.out.println("Lambda implemented");};
		p1.MyInterMethod();*/
		
		/*MyInter p2=(a,b)->{
			System.out.println("Result: "+(a+b));
		};
		p2.add(4, 6);
		MyInter p3=(a,b)->{
			System.out.println("Result: "+(a*b));
		};
		p3.add(4, 6);*/
		MyInter add=(a,b)->{return a+b;};
		MyInter sub=(a,b)->{return a-b;};
		System.out.println(add.calc(4, 5));
		System.out.println(add.calc(10, 2));
		List<String> list=new ArrayList<>();
		list.add("john");
		list.add("andrew");
		list.add("mathew");
		list.add("james");
		list.forEach((x)->System.out.println(x));
		
		
	}

	
}

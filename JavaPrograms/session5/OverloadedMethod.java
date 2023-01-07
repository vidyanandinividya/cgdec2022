package session5;

class A{}
class B extends A{}
class C extends B{}
public class OverloadedMethod {
	/*public void test(String str) //most specific class
	{
		System.out.println("String");
	}
	public void test(Object obj) //most generic class
	{
		System.out.println("Object");
	}
	public void test(StringBuffer obj)//same hierarchy as string
	{
		System.out.println(obj);
	}*/
	
	//Object --- String
	/*public void test(B obj)
	{
		System.out.println("B");
	}
	public void test(C obj)
	{
		System.out.println("C");
	}*/
	// A -- B -- C
	public void test(Object obj)
	{
		System.out.println("Object");
	}
	public void test(char[] obj)
	{
		System.out.println("Char");
	}
	public void test(Integer obj)
	{
		System.out.println("int");
	}
	// Object -- char[] 
	// Object -- Number --- Integer
	public static void main(String[] args) {
		
		OverloadedMethod obj=new OverloadedMethod();
		//obj.test(null);
		//obj.test("hello");
		//obj.test(null);

	}

}

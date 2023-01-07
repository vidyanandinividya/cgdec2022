package session5;
class Parent1
{
	public static void print()
	{
		System.out.println("I am Parent");
	}
}
class Child1 extends Parent1
{
	
	public static void print()
	{
		System.out.println("I am Child");
	}
}
public class OverridingPrograms {

	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.print();

	}

}

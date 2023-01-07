package session5;
class Parent
{
	public void connect()
	{
		System.out.println("do connect in parent way");
	}
	public void fn1()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	@Override
	public void connect()
	{
		System.out.println("do connect in child way");
	}
	public void fn2()
	{
		System.out.println("Child Class");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Parent p=new Child(); //p is known as polymorphic variable
		p.connect(); //dynamic polymorphism
		p.fn1();
		//p.fn2();
		//the polymorphic value can call all the methods of
		//the parent class except overriden method
		//it can call only the overriden method of the child class

	}

}

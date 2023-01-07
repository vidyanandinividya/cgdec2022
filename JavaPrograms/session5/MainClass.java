package session5;

class Parent2
{
	public static int var=10;
	public void print()
	{
		int var=20;
		System.out.println("I am parent 1:"+var);
		System.out.println("I am parent 2:"+this.var);
	}
}
class Child2 extends Parent2
{
	public int var=30;
	public void print()
	{
		int var=40;
		System.out.println("I am Child 1:"+var);
		System.out.println("I am Child 2:"+this.var);
		System.out.println("I am Child 3:"+super.var);
	}
}
public class MainClass {

	public static void main(String[] args) {
		Parent2 p=new Parent2();
		System.out.println(p.var);
		p.print();
		Child2 c=new Child2();
		System.out.println(c.var);
		c.print();
		Parent2 pc=new Child2();
		System.out.println(pc.var);
		pc.print();

	}

}

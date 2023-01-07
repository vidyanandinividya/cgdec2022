package session5;

public class ArithmeticOperations {
	
	public void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	public void add(int num1,double num2)
	{
		System.out.println(num1+num2);
	}
	public void add(double num1,int num2)
	{
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		ArithmeticOperations obj=new ArithmeticOperations();
		obj.add(2, 3);
		System.out.println(obj.add(4, 5, 6));
		obj.add(10, 3.5);
		obj.add(5.4, 20);

	}

}

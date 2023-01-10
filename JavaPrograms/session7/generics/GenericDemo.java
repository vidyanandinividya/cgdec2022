package session7.generics;

class BankAccount<T extends Number>
{
	T t1;
	public BankAccount(T t1)
	{
		this.t1=t1;
	}
	public void display()
	{
		System.out.println(t1);
	}
	public <T> void depositMoney(T[] money)
	{
		for(T i:money)
		{
			System.out.println(i);
		}
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		//BankAccount<String> b1=new BankAccount<>("hello");
		//b1.display();
		BankAccount<Integer> b2=new BankAccount<>(10);
		b2.display();
		BankAccount<Double> b3=new BankAccount<>(10.25);
		b3.display();
		Integer[] m1= {100,200,300};
		Double[] m2= {20.45,67.34,90.34};
		//b1.depositMoney(m1);
		b2.depositMoney(m2);

	}

}

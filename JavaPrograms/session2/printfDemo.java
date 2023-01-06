package session2;

public class printfDemo {

	public static void main(String... args) {
		String str1="vidya";
		String str2="mishra";
		System.out.printf("%S %n'%10S'",str1,str2);
		int num=123;
		System.out.printf("%05d%n",num);
		double val=34567.56874;
		System.out.printf("%.3f%n",val);
		add("john",1,2,3);
		add("jack",10,20);
		add("harry",50,30,40,50);

	}
	public static void add(String name,int... val)
	{
		int sum=0;
		for(int i:val)
		{
			sum+=i;
		}
		
		System.out.println("Result: "+sum);
	}

}

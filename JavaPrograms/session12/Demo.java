package session12;

public class Demo {
	
	public static int add(int num[])
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Demo.add(new int[] {1,2,3}));

	}

}

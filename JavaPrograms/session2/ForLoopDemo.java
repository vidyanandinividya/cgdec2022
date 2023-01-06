package session2;

public class ForLoopDemo {
	public static void main(String []args)
	{
		/*for(int i=1,j=1;i<=5 && j<=5;i++,j++)
		{
			System.out.println(i*j);
		}*/
		/*for(;;) //empty loop
		{
			System.out.println("Optional expressions");
		}*/
		/*for(int i=1;;i++) //infinite loop
		{
			System.out.println("inifinite loop");
		}*/
		/*int i=0;
		for(;i<5;i++) //loop without initialization
		{
			System.out.println(i);
		}*/
		/*int i=0,n=5;
		for(;;)
		{
			System.out.println(i);
			if(i>=n)
				break;
			i++;
		}*/
		/*for(int i=0;i>=0;i++)
		{
			System.out.println(i);
		}*/
		int[] nums= {2,4,6,8,10};
		int sum=0;
		String[] names= {"john","jack","hary","Thomas","Andrew"};
		for(int i:nums)
		{
			sum+=i;
			
		}
		System.out.println(sum);
		for(String name:names)
		{
			if(name.length()<=4)
			{
			System.out.println(name);
			}
		}
	
	}

}

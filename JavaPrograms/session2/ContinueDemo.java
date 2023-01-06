package session2;

public class ContinueDemo {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			System.out.println(i);
		}*/
		int students=20;
		int days[]= {0,1,2,3};
		for(int i=0;i<days.length;i++)
		{
			System.out.println("Day "+days[i]);
			int rem=days[i]%2;
			for(int j=1;j<=students;j++)
			{
				if(j%2==rem)
				{
					continue;
				}
				System.out.print(j + ",");
			}
			System.out.println("\n");
		}

	}

}

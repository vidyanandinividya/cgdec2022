package session2;

public class BreakDemo {

	public static void main(String[] args) {
		outer:for(int i=1;i<4;i++) //outer loop
		{
			inner:for(int j=1;j<7;j++) //inner loop
			{
				//when the value of j becomes 4, this loop terminates
				if(j==4)
				{
					break inner;
				}
				if(i==2)
				{
					break outer;
				}
				System.out.print(j + " ");
			}
			//System.out.println("\nEnd of inner  loop");
			
		}
		System.out.println("\nEnd of outer loop");
		

	}

}

package session2;

public class ExitDemo {

	public static void main(String[] args) {
		int num[]= {0,2,4,6,8,10,12};
		for(int i=0;i<num.length;i++)
		{
			if(i>4)
			{
				System.exit(0);
			}
			System.out.println("i:"+i +"num[i]: "+num[i]);
		}

	}

}

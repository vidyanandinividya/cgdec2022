package session3;

public class Student {
	String name;
	static String institute="ABC";
	
	{
		int num=20;
		System.out.println(num);
	}
	public static void updateDetails()
	{
		institute="DEF";
		//name="vidya";
	}
	public void printDetails()
	{
		System.out.println("Name:" +name + "Institute: "+institute);
	}
	//static block
	{
		int num=10;
		System.out.println(num);
	}
	
	{
		int num=30;
		if(num>20)
		{
		System.out.println(num);
		}
		
	}

	public static void main(String[] args) {
		
		{
			int num=40;
			System.out.println(num);
		}
		Student.updateDetails();
		new Student().printDetails();
		

	}

}

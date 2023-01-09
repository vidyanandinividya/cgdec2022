package session6;

public class CustomExceptionDemo {

	static void checkAge(int age) throws ValidAge
	{
		if(age<18)
		{
			throw new ValidAge("You must be at least 18 years old");
		}
		else
		{
			System.out.println("You are old enough");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(22);
		} catch (ValidAge e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}

package session12;

public class Sample {
	private String message;
	public Sample(String message)
	{
		this.message=message;
	}
	public void printMessage()
	{
		System.out.println(message);
		int divide=1/0;
	}
	public String print()
	{
			message="Hi!"+message;
			System.out.println(message);
			return message;
	}

}

package session3;

public class FinalVariableDemo {
	
	final String FIELD_TWO;
	public FinalVariableDemo() {
		FIELD_TWO="FIxed Value Two";
	}
	
	//while declaration
	static final String FIELD_NAME="Fixed value";
	
	//inside the static initializer block
	
	static final String FIELD_ONE;
	static
	{
		FIELD_ONE="Fixed Value ONE";
	}
	
	//inside the constructor
	
	
	public static void main(String []args)
	{
		final int count=15;
		System.out.println(count);
		
		
	}

}

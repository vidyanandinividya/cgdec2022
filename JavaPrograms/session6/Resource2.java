package session6;

public class Resource2 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Resource 2");
		
	}
	public void doSomething()
	{
		System.out.println("something-->Resource2");
	}

}

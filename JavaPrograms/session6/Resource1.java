package session6;

public class Resource1 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Resource 1");
		
	}
	public void doSomething()
	{
		System.out.println("something-->Resource1");
	}

}

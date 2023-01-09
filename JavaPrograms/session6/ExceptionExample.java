package session6;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
interface InterfaceTest
{
	public void test() throws IOException;
}

public class ExceptionExample implements InterfaceTest{

	@Override
	public void test() throws IOException,RuntimeException,Error,FileAlreadyExistsException{
		
	}

	public static void main(String[] args) {
		
	}
	/*private static void test() 
	{
		try
		{
			System.out.println("In try");
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println("In catch");
			throw new ArrayIndexOutOfBoundsException();
		}
		finally
		{
			System.out.println("In finally");
			throw new NullPointerException();
		}
		
	}*/

	
}

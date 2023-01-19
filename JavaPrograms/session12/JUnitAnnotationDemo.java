package session12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotationDemo {
	private ArrayList<String> list;
	@BeforeClass
	public static void fn1()
	{
		System.out.println("executed before all test cases");
	}
	@Before
	public void fn2()
	{
		list=new ArrayList<>();
		System.out.println("executed before each test case");
	}
	@AfterClass
	public static void fn3()
	{
		System.out.println("executed after all test cases");
	}
	@After
	public void fn4()
	{
		list.clear();
		System.out.println("executed after each test cases");
	}
	@Test
	public void fn5()
	{
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		System.out.println("Test case 1");
	}
	@Ignore
	public void fn6()
	{
		System.out.println("Test case 2, this execution is ignored");
	}
	@Test(timeout = 10)
	public void fn7()
	{
		System.out.println("Test 7");
	}
	@Test(expected = NoSuchMethodException.class)
	public void fn8() throws NoSuchMethodException
	{
		throw new NoSuchMethodException("Method");
		//System.out.println("It will check for the specified exceotion during the execution");
	}
	

}

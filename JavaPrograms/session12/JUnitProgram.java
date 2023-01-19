package session12;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitProgram {
	@BeforeClass
	public static void preClass()
	{
		System.out.println("This method runs one time before the class");
	}
	@Before
	public void setUp()
	{
		System.out.println("This method runs before each test case");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	@After
	public void tearDown()
	{
		System.out.println("This method runs after each test case");
	}
	@AfterClass
	public static void postClass()
	{
		System.out.println("This method runs one time after the class");
	}
	

}

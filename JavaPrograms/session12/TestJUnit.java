package session12;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJUnit {
	
	@Test
	public void testSetup()
	{
		String str="welcome to JUnit testing";
		assertEquals("welcome to JUnit testing", str);
	}
	@Test
	public void testAdd()
	{
		assertEquals(12, Demo.add(new int[] {3,4,5}));
	}
	@Test
	public void testAssert()
	{
		String str1="Hello";
		String str2="Hello";
		String str3="test";
		String str4="test";
		String str5=null;
		int num1=1;
		int num2=2;
		int[] arr= {1,2,3};
		int[] arr1= {1,2,3};
		assertEquals(str1, str2);
		//str1.equals(str2)
		assertSame(str3,str4);
		//str3==str4
		assertNotSame(str1, str3);
		assertNotNull(str1);
		assertNull(str5);
		assertTrue(num1<num2);
		assertArrayEquals(arr, arr1);
	}
	

}

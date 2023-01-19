package session12;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculationTest {
	private int num1;
	private int num2;
	private int expectedResult;
	private Calculation calculation;
	public CalculationTest(int num1, int num2, int expectedResult) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize()
	{
		calculation=new Calculation();
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},
			{10,20,30},{5,6,11},{3,4,7}});
		
	}
	@Test
	public void testCalculation()
	{
		System.out.println("Sum of numbers=:"+expectedResult);
		assertEquals(expectedResult, calculation.sum(num1,num2));
	}
	@Disabled("Disabled for some time")
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
}

package session12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
@Disabled("Disable the class")
public class DisabledMethodTest {
	
	@Test
	public void test1()
	{
		assertEquals(2, 1+1);
	}
	@Test
	public void test2()
	{
		assertEquals(6, 3+3);
	}

}

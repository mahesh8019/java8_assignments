import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testAdditionOfTwoNumbers()
	{
	assertEquals(9, Calculation.add(4,5));
	}
	@Test
	public void testSubstrationOfTwoNumbers()
	{
	assertEquals(9, Calculation.sub(14,5));
	}
	@Test
	public void testMultiplicationOfTwoNumbers()
	{
	assertEquals(45, Calculation.mul(9,5));

	}
	@Test
	public void testDivisionOfTwoNumbers() throws invalidException
	{
	assertEquals(4, Calculation.div(12,3));
	
}
}


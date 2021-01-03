package clspkg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator(7, 10);
	}
	@Test
	public void test() {
		Assert.assertEquals(17, calculator.add());
	}
}

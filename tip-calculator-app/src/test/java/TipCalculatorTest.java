import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test TipCalculator
 */
public class TipCalculatorTest {

	@Test
	public void testTipCalculator() {
		
		TipCalculator tipCalc = new TipCalculator(new Money(100), 10);
		
		//tip
		assertEquals("$0.10", tipCalc.calculateTip().toString());
		
		//total after tip
		assertEquals("$1.10", tipCalc.calculateTotalAfterTip().toString());
		
		tipCalc = new TipCalculator(new Money(0), 10);
		
		//tip
		assertEquals("$0.00", tipCalc.calculateTip().toString());
		
		//total after tip
		assertEquals("$0.00", tipCalc.calculateTotalAfterTip().toString());
		
	}

}

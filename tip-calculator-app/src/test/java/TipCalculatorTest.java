import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test TipCalculator
 */
public class TipCalculatorTest {

	@Test
	public void testTipCalculator() {
		
		//create amount and add some money
		Money amount = new Money(2000);
		amount = amount.add(new Money(10, 50));
		
		TipCalculator tipCalc = new TipCalculator(amount, 10);
		
		//tip
		assertEquals("$3.05", tipCalc.calculateTip().toString());
		
		//total after tip
		assertEquals("$33.55", tipCalc.calculateTotalAfterTip().toString());
		
		tipCalc = new TipCalculator(new Money(0), 10);
		
		//tip
		assertEquals("$0.00", tipCalc.calculateTip().toString());
		
		//total after tip
		assertEquals("$0.00", tipCalc.calculateTotalAfterTip().toString());
		
	}

}

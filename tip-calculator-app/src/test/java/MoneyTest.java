import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test money
 *
 */
public class MoneyTest {

	//get constructor with total cents
	@Test
	public void testConstructorWithTotalCentsMoney() {
		
		Money money = new Money(100);
		
		assertEquals(1, money.getDollars());
		assertEquals(0, money.getCents());
		
		money = new Money(102);
		
		assertEquals(1, money.getDollars());
		assertEquals(2, money.getCents());
		
	}
	
	//get constructor with dollars and cents
	@Test
	public void testConstructorWithDollarsAndCentsMoney() {
		
		Money money = new Money(5, 7);
		
		assertEquals(5, money.getDollars());
		assertEquals(7, money.getCents());
		
		money = new Money(56, 67);
		
		assertEquals(56, money.getDollars());
		assertEquals(67, money.getCents());
		
	}
}

/**
 * TipCalculator calculate the 
 * tip based on the amount,
 * the price, tip percent
 *
 */
public class TipCalculator {

	/**
	 * total amount
	 */
	private Money totalAmount;
	
	/**
	 * tip percent (%)
	 * zero to positive number
	 */
	private int tipPercent;

	/**
	 * constructor
	 * 
	 * @param totalAmount total amount
	 * @param tipPercent tip percent
	 */
	public TipCalculator(Money totalAmount, int tipPercent) {
		this.totalAmount = totalAmount;
		this.tipPercent = tipPercent;
	}
	
	/**
	 * calculate tip
	 * @return tip
	 */
	public Money calculateTip(){
		return new Money((long)((totalAmount.getTotalCents() * tipPercent) / 100.0));
	}
	
	/**
	 * calculate the total after tip
	 * @return total after tip
	 */
	public Money calculateTotalAfterTip(){
		return totalAmount.add(calculateTip());
	}
}

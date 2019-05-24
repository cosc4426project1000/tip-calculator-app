/**
 * Money represents the money based on cents
 */
public class Money {
	/**
	 * total cents
	 */
    private long totalCents;

    /**
     * Constructor
     * @param theDollars the number of dollars
     * @param theCents   the number of cents
     */
    public Money(int theDollars, int theCents)
    {
        this.totalCents = theDollars * 100L + theCents;
    }

    /**
     * Constructor
     *
     * @param theCents  the total number of cents
     */
    public Money(long theCents)
    {
        this.totalCents = theCents;
    }

    /**
     * getter of dollars
     *
     * @return the number of dollars
     */
    public int getDollars()
    {
        return (int) (this.totalCents / 100);
    }

    /**
     * getter of cents
     *
     * @return the number of cents (between 0 and 99, inclusive)
     */
    public int getCents()
    { 
        return (int) (this.totalCents % 100);
    }
    
    /**
     * adds two money values
     * 
     * @param a Money, the Money amount to add
     * @return Money, the sum
     */
    public Money add (Money theMoney)
    {
        return new Money (this.totalCents + theMoney.totalCents);
    }
    
    /**
     * get total cents
	 * @return the totalCents
	 */
	public long getTotalCents() {
		return totalCents;
	}
	
	/**
     * return String representation of this Money object
     *
     * @return a String representation of this object
     */
    public String toString()
    {
        String result = "$" + this.getDollars() + "."; 

        if (this.getCents() < 10) {
            result += "0";
        }

        result += this.getCents();
        return result;
    }
}

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
}

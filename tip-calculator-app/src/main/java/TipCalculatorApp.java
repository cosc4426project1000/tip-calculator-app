import java.util.Scanner;

/**
 * TipCalculatorApp is the Java application
 * that calculate the tip
 */
public class TipCalculatorApp {

	/**
	 * Scanner to read from keyboard
	 */
	private static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * main method to start Java application
	 * @param args main arguments
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to my Tip calculator app\n");
		
		// amount
		int amount;
		//top percent
		int tipPercent;
		
		//read amount
		do{
			System.out.print("Enter the amount in cents: ");
			amount = readInt();
			
			//validate number
			if (amount < 0){
				System.out.println("The amount must be zero or positive number");
			}else{
				break;
			}
		}while(amount < 0);
		
		//read tip percent
		do{
			System.out.print("Enter the tip percent: ");
			tipPercent = readInt();
			
			//validate number
			if (tipPercent < 0){
				System.out.println("The tip percent must be zero or positive number");
			}else{
				break;
			}
		}while(tipPercent < 0);
		
		//create TipCalculator object
		TipCalculator tipCalc = new TipCalculator(new Money(amount), tipPercent);
		
		//calculate tip, total and display them
		System.out.println("\n\nTip  : " + tipCalc.calculateTip());
		System.out.println("Total: " + tipCalc.calculateTotalAfterTip());
	}
	
	/**
	 * read an integer
	 * 
	 * (if there is exception, display error and read again)
	 * 
	 * @return integer
	 */
	public static int readInt() {

		int number = 0; // an integer number

		while (true) {
			try {
				number = Integer.parseInt(keyboard.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("Invalid input. Try again: ");
			}
		} // end while to read integer number

		return number;
	}
}

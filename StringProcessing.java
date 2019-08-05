import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class StringProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date in format dd-mm-yyyy");
		String date = sc.nextLine();
		
		int numberOfDays = UserMainCode.getLastDayOfMonth(date);
		System.out.println("Number of days : " + numberOfDays);

	}

}

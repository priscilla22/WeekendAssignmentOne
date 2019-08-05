import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two dates in format dd-mm-yyyy");
		String dateOne = sc.nextLine();
		String dateTwo = sc.nextLine();
		
		String olderDate = UserMainCode.findOldDate(dateOne, dateTwo);
		
		System.out.println(olderDate);

	}

}

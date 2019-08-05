import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class DayOfTheWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in formate 'mm-dd-yyyy'");
		String date = sc.nextLine();
		String day = UserMainCode.getDay(date);
		System.out.println(day);

	}

}

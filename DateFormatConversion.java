import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class DateFormatConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in format dd/mm/yyyy");
		String dateFormatOne = sc.nextLine();
		
		String dateFormatTwo = UserMainCode.convertDateFormat(dateFormatOne);
		
		System.out.println(dateFormatTwo);

	}

}

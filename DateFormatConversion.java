import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
class UserMainCodeTwentyThree {
	public static String convertDateFormat(String dateFormatOne){
		String array[] = dateFormatOne.split("/");
		
		String dateFormatTwo = array[0] + "-" + array[1] + "-" + array[2];
		
		return dateFormatTwo;
	}
}
public class DateFormatConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in format dd/mm/yyyy");
		String dateFormatOne = sc.nextLine();
		
		String dateFormatTwo = UserMainCodeTwentyThree.convertDateFormat(dateFormatOne);
		
		System.out.println(dateFormatTwo);

	}

}

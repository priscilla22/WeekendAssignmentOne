import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.util.regex.Pattern;
public class PANCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the PAN Number : (AAAA111A)");
		String pan = sc.nextLine();
		
		boolean valid = UserMainCode.validatePAN(pan);
		
		if(valid)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");

	}

}

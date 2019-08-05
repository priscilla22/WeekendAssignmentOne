import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.util.regex.Pattern;
class UserMainCodeEighteen {
	public static boolean validatePAN(String pan){
		String pattern = "^([A-Z]{4})([0-9]{3})[A-Z]$";
		return Pattern.matches(pattern, pan);
		
	}
}
public class PANCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pan = sc.nextLine();
		
		boolean valid = UserMainCodeEighteen.validatePAN(pan);
		
		if(valid)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");

	}

}

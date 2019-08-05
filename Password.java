import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the password : ");
		String pswd = sc.nextLine();
		
		boolean validate = UserMainCode.validatePassword(pswd);
		if(validate)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}

}

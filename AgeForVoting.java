import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class AgeForVoting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the DOB in format dd/mm/yyyy");
		String dob = sc.nextLine();
		
		String eligible = UserMainCode.getAge(dob);
		System.out.println(eligible);

	}

}

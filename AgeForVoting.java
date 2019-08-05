import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
class UserMainCodeTwentyFive {
	public static String getAge(String dob){
		int currentYear = 2014;
		String array[] = dob.split("/");
		int birthYear = Integer.parseInt(array[2]);
		
		if((currentYear-birthYear)>=18)
			return "Eligible";
		else 
			return "Not Eligible";
	}
}
public class AgeForVoting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the DOB in format dd/mm/yyyy");
		String dob = sc.nextLine();
		
		String eligible = UserMainCodeTwentyFive.getAge(dob);
		System.out.println(eligible);

	}

}

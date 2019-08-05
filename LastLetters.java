import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class LastLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		String inputString = sc.nextLine();
		
		String finalString = UserMainCode.getLastLetter(inputString);
		System.out.println(finalString);
	}
}

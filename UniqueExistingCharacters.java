import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class UniqueExistingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		//Input the two input strings
		System.out.print("Enter the first string : ");
		String stringOne = sc.nextLine();
		System.out.print("Enter the second string : ");
		String stringTwo = sc.nextLine();
		
		String newStringOne = UserMainCode.replacePlus(stringOne, stringTwo);
		
		System.out.println("The output string is " + newStringOne);	
	}
	
}

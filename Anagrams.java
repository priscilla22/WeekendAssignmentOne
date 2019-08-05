import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input strings (sentences in lower case) :");
		String stringOne = sc.nextLine();
		String stringTwo = sc.nextLine();
		
		int result = UserMainCode.getAnagram(stringOne, stringTwo);
		if(result == 1)
			System.out.println("Anagrams");
		else 
			System.out.println("Not Anagrams");

	}

}

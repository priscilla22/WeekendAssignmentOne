import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence (lower case): ");
		String sentence = sc.nextLine();
		String maxVowelString = UserMainCode.storeMaxVowelWord(sentence);
		System.out.println(maxVowelString);	

	}

}

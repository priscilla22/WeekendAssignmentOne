import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class MaxVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		String maxVowelString = UserMainCodeTwelve.getWordWithMaximumVowels(sentence);
		System.out.println(maxVowelString);
		

	}

}

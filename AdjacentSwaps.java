import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class AdjacentSwaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string = sc.nextLine();
		
		string = UserMainCode.swapPairs(string);
		
		System.out.println(string);

	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class KaprekarNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		
		int result = UserMainCode.getKaprekarNumber(number);
		if(result == 1)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not a Kaprekar Number");

	}

}

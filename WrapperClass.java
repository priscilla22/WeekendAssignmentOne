import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class WrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the binary number");
		String binary = sc.next();
		System.out.println("Enter the octal number");
		String octal = sc.next();
		System.out.println("Enter the hexadecimal number");
		String hexadecimal = sc.next();
		
		//Printing all the three numbers in integer form
		System.out.println("The integer value of the binary number " + binary + " is " + Integer.parseInt(binary, 2));
		System.out.println("The integer value of the octal number " + octal + " is " + Integer.parseInt(octal, 8));
		System.out.println("The integer value of the hexadecimal number " + hexadecimal + " is " + Integer.parseInt(hexadecimal, 16));
	}

}

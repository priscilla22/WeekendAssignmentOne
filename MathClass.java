import java.util.Scanner;
import java.lang.Math;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class MathClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer");
		Integer numberOne = sc.nextInt();
		System.out.println("Enter the second integer");
		Integer numberTwo = sc.nextInt();
		
		//Absolute values
		System.out.println("Absolute value of " + numberOne + " is " + Math.abs(numberOne));
		System.out.println("Absolute value of " + numberTwo + " is " + Math.abs(numberTwo));
		
		//Equality
		if(numberOne.equals(numberTwo))
			System.out.println(numberOne + " = " + numberTwo);
		else 
			System.out.println(numberOne + " != " + numberTwo);

	}

}

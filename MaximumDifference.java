import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.lang.Math;

public class MaximumDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the integers");
		int array[] = new int[n];
		for(int i=0;i<n;i++)
			array[i] = sc.nextInt();
		
		int index = UserMainCode.findMaxDifference(array);
		System.out.println(index);

	}

}

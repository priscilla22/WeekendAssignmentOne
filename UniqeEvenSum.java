import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
class UserMainCodeTwo {
	
}

public class UniqeEvenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[20];
		System.out.print("Enter the number of elements :");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			array[i] = sc.nextInt();
		
		int evenSum = UserMainCode.addUniqueEven(array,n);
		if(evenSum == -1)
			System.out.println("No even numbers");
		else System.out.println("Unique Even Sum" + evenSum);
		
	}

}

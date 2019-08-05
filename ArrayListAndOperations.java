/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.util.*;

public class ArrayListAndOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the integers : ");
		ArrayList<Integer> arrayOne = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arrayOne.add(sc.nextInt());
		
		ArrayList<Integer> arrayTwo = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arrayTwo.add(sc.nextInt());
		
		char operator = sc.next().charAt(0);
		
		ArrayList<Integer> outputList = UserMainCode.PerformSetOperations(arrayOne, arrayTwo, operator);
		
		for(Integer i : outputList)
			System.out.println(i);

	}

}

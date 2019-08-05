import java.util.*;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class ArrayListManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in each array : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arrayListOne = new ArrayList<Integer>(n);
		ArrayList<Integer> arrayListTwo = new ArrayList<Integer>(n);
		
		//Inputting the first arraylist elements
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<n;i++)
			arrayListOne.add(sc.nextInt());
		//Inputting the second arraylist elements
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<n;i++)
			arrayListTwo.add(sc.nextInt());
		
		ArrayList<Integer> outputList = UserMainCode.generateOddEvenList(arrayListOne, arrayListTwo, n);

		for(Integer num : outputList )
			System.out.println(num);
	}

}

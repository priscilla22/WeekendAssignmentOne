import java.util.*;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class MasteringHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			int value = sc.nextInt();
			map.put(key, value);
		}
		int average = UserMainCode.getAverageOfOdd(map);
		System.out.println(average);
	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class LargestKeyInHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of pairs in the map : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the integer key and string value pairs");
		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);	
		}
		
		String highestValue = UserMainCode.getMaxKeyValue(map);
		System.out.println(highestValue);

	}

}

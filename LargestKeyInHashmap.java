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

class UserMainCodeTwenty {
	public static String getMaxKeyValue(HashMap<Integer,String> map){
		int highestKey = 0;
		String highestKeyValue = "";
		Iterator iter = map.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        int key = (int)pair.getKey();
	        if(key>highestKey){
	        	highestKey = key;
	        	highestKeyValue = (String)pair.getValue();
	        }
	    }
		return highestKeyValue;
	}
	
}
public class LargestKeyInHashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0;i<n;i++){
			int key = sc.nextInt();
			String value = sc.next();
			map.put(key, value);	
		}
		
		String highestValue = UserMainCodeTwenty.getMaxKeyValue(map);
		System.out.println(highestValue);

	}

}

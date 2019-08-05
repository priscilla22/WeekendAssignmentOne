import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
class UserMainCodeTwentyTwo {
	public static ArrayList<String> getName(HashMap<Integer,String> map){
		
		String pattern = "^[a-z]((([a-zA-Z]*)([0-9]+)([a-zA-Z]*))+)[A-Z]$";
				
		ArrayList<String> nameList = new ArrayList<>();
		
		Iterator iter = map.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        String value = (String)pair.getValue();
	        if(Pattern.matches(pattern, value)){
	        	nameList.add(value);
	        }
	    }
	    
	    return nameList;
		
	}
}
public class HashMapToArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input the number of records;
		int n = sc.nextInt();
		
		//Input n employee ids and names into a hashmap
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		for(int i=0;i<n;i++){
			int id = sc.nextInt();//key
			String name = sc.next(); //value
			map.put(id, name);
		}
		ArrayList<String> nameList = UserMainCodeTwentyTwo.getName(map);
		
		for(String s : nameList)
			System.out.println(s);
	}

}

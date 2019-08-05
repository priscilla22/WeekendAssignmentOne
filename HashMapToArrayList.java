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
public class HashMapToArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input the number of records;
		System.out.print("Enter the number of records : ");
		int n = sc.nextInt();
		
		//Input n employee ids and names into a hashmap
		System.out.println("Enter the integer key and string value for each record");
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		for(int i=0;i<n;i++){
			int id = sc.nextInt();//key
			String name = sc.next(); //value
			map.put(id, name);
		}
		ArrayList<String> nameList = UserMainCode.getName(map);
		
		for(String s : nameList)
			System.out.println(s);
	}

}

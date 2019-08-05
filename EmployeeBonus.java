/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.util.*;

public class EmployeeBonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Integer,String> dobMap = new HashMap<>();
		HashMap<Integer,Integer> salaryMap = new HashMap<>();
		for(int i=0;i<n;i++){
			int id = sc.nextInt();
			String dob = sc.next();
			int salary = sc.nextInt();
			dobMap.put(id, dob);
			salaryMap.put(id, salary);
		}
		
		TreeMap<Integer,Integer> bonusMap = UserMainCode.calculateRevisedSalary(dobMap, salaryMap);

		Iterator iter = bonusMap.entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry pair = (Map.Entry)iter.next();
	        int id = (int)pair.getKey();
	        int revisedSalary = (int)pair.getValue();
	        System.out.println(id);
	        System.out.println(revisedSalary);
	        
	    }
		
	}

}

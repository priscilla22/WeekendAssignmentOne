import java.util.*;
import java.text.SimpleDateFormat;  
/**
 * 
 */

/**
 * @author pandrew
 *
 */

public class Retirement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employee records : ");
		int n = sc.nextInt();
		HashMap<String,String> employeeList = new HashMap<>();
		for(int i=0;i<n;i++){
			System.out.println("ID and DOB : ");
			String id = sc.next();
			String dob = sc.next();
			employeeList.put(id, dob);
		}
		
		ArrayList<String> retirementList = UserMainCode.retirementEmployeeList(employeeList);
		for(String e : retirementList)
			System.out.println(e);
	}

}

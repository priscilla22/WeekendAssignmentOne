import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
import java.util.*;

public class MaxScorer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of records : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the records in the format name-mark1-mark2-mark3");
		ArrayList<String> records = new ArrayList<String>();
		for(int i=0;i<n;i++){
			records.add(sc.next());
		}
		
		String highestScorer = UserMainCode.getHighestScorer(records);
		System.out.println(highestScorer);

	}

}

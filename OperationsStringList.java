import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class OperationsStringList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		int choice = -1;
		String item;
		while(choice != 5){
			System.out.println("1.Insert 2. Search 3. Delete 4. Display 5. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice){
			case 1: //Insert
				System.out.print("Enter the item to be inserted : ");
				item = sc.next();
				stringList.add(item);
				System.out.println("Item inserted successfully");
				break;
			case 2: //Search
				System.out.print("Enter item to search : ");
				item = sc.next();
				if(stringList.contains(item))
					System.out.println("Item found in the list");
				else
					System.out.println("Item not found in the list");
				break;
			case 3: //Delete
				System.out.print("Enter the item to delete : ");
				item = sc.next();
				if(stringList.contains(item)){
					stringList.remove(item);
					System.out.println("Item deleted successfully");
				}
				else
					System.out.println("Item not found in the list");
				break;
			case 4://Display
				System.out.println("The items in the list are : ");
				for(String s : stringList)
					System.out.println(s);
				break;
			case 5: //Exit
				break;
			}
		}
		
		

	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

class UserMainCodeTwentyFour{
	public static int getLastDayOfMonth(String date){
		String array[] = date.split("-");
		
		int month = Integer.parseInt(array[1]);
		int year = Integer.parseInt(array[2]);
		int numberOfDays = 0;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numberOfDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numberOfDays = 30;
			break;
		case 2:
			if(year%4 == 0)
				numberOfDays = 29;
			else 
				numberOfDays = 28;
			break;
		}
		return numberOfDays;
	}
}
public class StringProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date in format dd-mm-yyyy");
		String date = sc.nextLine();
		
		int numberOfDays = UserMainCodeTwentyFour.getLastDayOfMonth(date);
		System.out.println(numberOfDays);

	}

}

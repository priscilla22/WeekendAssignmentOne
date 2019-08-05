import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

class UserMainCodeTwentyOne {
	public static String getDay(String d){
		String day = "";
		String dateArray[] = d.split("-");
		int date = Integer.parseInt(dateArray[1]);
		int month = Integer.parseInt(dateArray[0]);
		int year = Integer.parseInt(dateArray[2]);
	    
		//Sakamoto Algorithm for finding day og week
		int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	    year -= (month < 3)?1:0;
	    int n = (year + year/4 - year/100 + year/400 + t[month-1] + date) % 7;
	    
	    switch(n){
	    case 0:
	    	day = "Sunday";
	    	break;
	    case 1:
	    	day = "Monday";
	    	break;
	    case 2:
	    	day = "Tuesday";
	    	break;
	    case 3:
	    	day = "Wednesday";
	    	break;
	    case 4:
	    	day = "Thursday";
	    	break;
	    case 5:
	    	day = "Friday";
	    	break;
	    case 6:
	    	day = "Saturday";
	    	break;
	    }

		
		return day;
	}
}
public class DayOfTheWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter date in formate 'mm-dd-yyyy'");
		String date = sc.nextLine();
		String day = UserMainCodeTwentyOne.getDay(date);
		System.out.println(day);

	}

}

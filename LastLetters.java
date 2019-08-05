import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

class UserMainCodeNineteen {
	public static String getLastLetter(String string){
		String finalString = "";
		String words[] = string.split(" ");
		for(int i=0;i<words.length;i++){
			char c = words[i].charAt(words[i].length()-1);
			finalString += Character.toUpperCase(c);
			if(i!=words.length-1)
				finalString += "$";
		}
		return finalString;
	}
}
public class LastLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputString = sc.nextLine();
		
		String finalString = UserMainCodeNineteen.getLastLetter(inputString);
		System.out.println(finalString);

	}

}

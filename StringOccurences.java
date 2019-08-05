import java.util.Scanner;

public class StringOccurences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two input sentences");
		String stringOne = sc.nextLine();
		String stringTwo = sc.nextLine();
		
		int count = UserMainCode.countNoOfWords(stringOne, stringTwo);
		System.out.println("String count : " + count);
	}

}

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


public class UniqueSymbols {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean unique = false;
		int count = 0;
		
		Set<Cards> CardsSet = new HashSet<Cards>();
		while(!unique){
			System.out.println("Enter a Card");
			String symbol = sc.next();
			int number = sc.nextInt();
			Cards Cards = new Cards(symbol,number);
			CardsSet.add(Cards);
			count++ ;
			if(CardsSet.size() == 4)
				unique = true;
		}

		
		System.out.println("Four Cards gathered in " + count + " Cards");
		for(Cards c : CardsSet){
			System.out.println(c.getSymbol() + " " + c.getNumber());
		}

	}

}

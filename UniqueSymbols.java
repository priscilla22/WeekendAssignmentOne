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

class Card {
	private String symbol;
	private int number;
	
	public Card(String symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getNumber() {
		return number;
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
	
	
	
}
public class UniqueSymbols {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean unique = false;
		int count = 0;
		
		Set<Card> cardSet = new HashSet<Card>();
		while(!unique){
			System.out.println("Enter a card");
			String symbol = sc.next();
			int number = sc.nextInt();
			Card card = new Card(symbol,number);
			cardSet.add(card);
			count++ ;
			if(cardSet.size() == 4)
				unique = true;
		}

//		Collections.sort(cardSet, new Comparator<Card>(){
//
//			@Override
//			public int compare(Card c1,Card c2) {
//				return (c1.getSymbol().compareTo(c2.getSymbol());
//			}
//
//		});
		
		System.out.println("Four cards gathered in " + count + "cards");
		for(Card c : cardSet){
			System.out.println(c.getSymbol() + " " + c.getNumber());
		}

	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


class Card {
	String symbol;
	int number;
	
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
	
}
public class CollectGroupCards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of cards : ");
		int n = sc.nextInt();

		Map<String,ArrayList<Card>> cardMap = new TreeMap<>();
		for(int i=0;i<n;i++){
			System.out.println("Card " + (i+1));
			String symbol = sc.next();
			int number = sc.nextInt();
			Card card = new Card(symbol,number);
			ArrayList<Card> tempList;
			if(cardMap.containsKey(symbol)){ //if a list for the key already exists
				tempList = cardMap.get(symbol);
				tempList.add(card);
				cardMap.put(symbol, tempList);
			}
			else {
				tempList = new ArrayList<Card>();
				tempList.add(card);
				cardMap.put(symbol, tempList);
			}
		}
		
		//Printing the distinct keys
		System.out.println("The distinct keys in the set are : ");
		System.out.println(cardMap.keySet());
		
		for(String key : cardMap.keySet()){
			System.out.println("Cards in " + key + " symbol");
			ArrayList<Card> tempList = cardMap.get(key);
			int sum=0;
			for(Card c : tempList){
				sum+= c.getNumber();
				System.out.println(c.getSymbol() + " " + c.getNumber());
			}
			System.out.println("Number of cards : " + tempList.size());
			System.out.println("Sum of cards : " + sum);
		}
	}

}

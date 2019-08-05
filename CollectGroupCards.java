import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


//class Cards {
//	String symbol;
//	int number;
//	
//	public Cards(String symbol, int number) {
//		this.symbol = symbol;
//		this.number = number;
//	}
//
//	public String getSymbol() {
//		return symbol;
//	}
//
//	public int getNumber() {
//		return number;
//	}
//	
//}
public class CollectGroupCards{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Cards : ");
		int n = sc.nextInt();

		Map<String,ArrayList<Cards>> CardsMap = new TreeMap<>();
		for(int i=0;i<n;i++){
			System.out.println("Card " + (i+1));
			String symbol = sc.next();
			int number = sc.nextInt();
			Cards Cards = new Cards(symbol,number);
			ArrayList<Cards> tempList;
			if(CardsMap.containsKey(symbol)){ //if a list for the key already exists
				tempList = CardsMap.get(symbol);
				tempList.add(Cards);
				CardsMap.put(symbol, tempList);
			}
			else {
				tempList = new ArrayList<Cards>();
				tempList.add(Cards);
				CardsMap.put(symbol, tempList);
			}
		}
		
		//Printing the distinct keys
		System.out.println("The distinct keys in the set are : ");
		System.out.println(CardsMap.keySet());
		
		for(String key : CardsMap.keySet()){
			System.out.println("Cards in " + key + " symbol");
			ArrayList<Cards> tempList = CardsMap.get(key);
			int sum=0;
			for(Cards c : tempList){
				sum+= c.getNumber();
				System.out.println(c.getSymbol() + " " + c.getNumber());
			}
			System.out.println("Number of Cards : " + tempList.size());
			System.out.println("Sum of Cards : " + sum);
		}
	}

}

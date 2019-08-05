import java.util.Scanner;
import java.lang.Math;
/**
 * 
 */

/**
 * @author pandrew
 *
 */
public class ProfitLoss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x; //number of dozens
		double y; //cost per dozen
		double z; //selling price per dozen
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of dozens of toys purchased : ");
		x = sc.nextInt();
		System.out.print("Enter the price per dozen : ");
		y = sc.nextDouble();
		System.out.print("Enter the selling price of 1 toy : ");
		z = sc.nextDouble();
		
		//Cost of one toy = cost per dozen / 12
		double w = y/12;
		//Gain = selling price - cost price
		double gain = z - w;
		//Profit = (gain/cost price) * 100
		double profit = (gain/w) * 100;
		
		System.out.format("Profit percentage is %.2f percent",profit);

	}

}

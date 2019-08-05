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

public class SetOfBoxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of boxes : ");
		int n = sc.nextInt();
		
		
		Set<Box> boxSet = new HashSet<Box>();
		for(int i=0;i<n;i++){
			System.out.println("Box " + (i+1));
			System.out.print("Length : ");
			double l = sc.nextDouble();
			System.out.print("Width : ");
			double w = sc.nextDouble();
			System.out.print("Height : ");
			double h = sc.nextDouble();
			Box box = new Box(w,l,h);
			boxSet.add(box);	
		}
		
		for(Box c : boxSet){
			System.out.println("Length=" + c.getLength() + " Width=" + c.getWidth() + "Height=" + c.getHeight() + " Volume=" + c.getVolume());
		}

	}

}

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

class Box {
	private double width,length,height,volume;
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
		this.volume = length * width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Box other = (Box) obj;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}
}
public class SetOfBoxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of boxes");
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

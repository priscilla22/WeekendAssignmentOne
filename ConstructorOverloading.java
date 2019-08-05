import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */


class Product{
	private long id;
	String productName;
	String supplierName;
	
	Product(){ } //Default Constructor
	
	Product(long id,String productName) { //Two parameter constructor
		setID(id);
		setProductName(productName);
		setSupplierName("Nivas");
	}
	
	Product(long id,String productName,String supplierName){ //Three parameter constructor
		setID(id);
		setProductName(productName);
		setSupplierName(supplierName);
	}
	
	//Getters and setters
	public long getID(){
		return id;
	}
	public void setID(long id){
		this.id = id;
	}
	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getSupplierName(){
		return supplierName;
	}
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}
}
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product;
		
		System.out.print("Enter the product ID : ");
		long id = sc.nextLong();
		System.out.print("Enter the product name : ");
		String productName = sc.next();
		System.out.print("Is the product supplied by Nivas Suppliers? Type yes or no (not case sensitive) : ");
		
		String yn = sc.next();
		yn = yn.toLowerCase();
		if(yn.equals("yes"))
			product = new Product(id,productName); //Calling 2 parameter constructor
		else{
			System.out.print("Enter the supplier name : ");
			String supplierName = sc.next();
			product = new Product(id,productName,supplierName); //calling 3 parameter constructor
		}
		
		System.out.println("The product ID is " + product.getID());
		System.out.println("The product name is " + product.getProductName());
		System.out.println("The supplier name is " + product.getSupplierName());	
	}

}

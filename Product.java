
public class Product {
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

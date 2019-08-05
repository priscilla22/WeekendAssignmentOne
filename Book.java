import java.util.ArrayList;

public class Book {
	private String name;
	private ArrayList<Author> authorList;
	private double price;
	private int qtyInStock;
	
	public Book() {
		qtyInStock = 0;
	}
	
	public Book(String name, ArrayList<Author> authorList, double price) {
		this.name = name;
		this.authorList = authorList;
		this.price = price;
		this.qtyInStock = 0;
	}
	
	public Book(String name, ArrayList<Author> authorList, double price, int qtyInStock) {
		super();
		this.name = name;
		this.authorList = authorList;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		String returnString = "";
		returnString += getName() + " authored by "; //Appending book name
		
		for(Author author : authorList){ //Appending all the authors names
			returnString += (author.getName() + " ");
		}
		
		//appending the cost 
		returnString += ("costs " + getPrice());
		
		if(qtyInStock == 0)
			returnString += ": Not available.";
		else
			returnString += ": Available.";
		return returnString;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Author> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(ArrayList<Author> authorList) {
		this.authorList = authorList;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

}
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */

class Author implements Comparable {
	private String name,email,gender;
	
	
	public Author(String name, String email, String gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


	public int compareTo(Object o) {
		return 0;
	}
	
}

class Book {
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
public class BookAuthor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Book book;
		System.out.print("Enter the book name : ");
		String bookName = sc.next();
		System.out.print("Enter the number of authors : ");
		int numberAuthors = sc.nextInt();
		ArrayList<Author> authorList = new ArrayList<>();
		for(int i=0;i<numberAuthors;i++){
			System.out.print("Enter the author's name : ");
			String authorName = sc.next();
			System.out.print("Enter the author's email ID : ");
			String emailId = sc.next();
			System.out.print("Enter the author's gender : ");
			String gender = sc.next();
			Author author = new Author(authorName,emailId,gender);
			authorList.add(author);
		}
		System.out.print("Enter the book price : ");
		double price = sc.nextDouble();
		System.out.print("Is the book currently available ? ");
		String yn = sc.next();
		yn = yn.toLowerCase();
		if(yn.equals("yes")){
			System.out.print("Enter the number of books available : ");
			int qtyInStock = sc.nextInt();
			book = new Book(bookName,authorList,price,qtyInStock);
		}
		else {
			book = new Book(bookName,authorList,price);
		}
		
		System.out.println(book.toString());

	}

}

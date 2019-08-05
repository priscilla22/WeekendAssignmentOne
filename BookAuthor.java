import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pandrew
 *
 */




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

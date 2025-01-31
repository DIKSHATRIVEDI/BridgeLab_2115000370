import java.util.Scanner;
public class LibraryBook{
    String title;
	String author;
	double price;
	boolean availability;
	public LibraryBook(String title,String author,double price){
	    this.title=title;
		this.author=author;
		this.price=price;
		this.availability=true;
	}
	public void borrowBook(){
	    if(availability){
		    System.out.println("Book borrowed ");
			availability=false;
		}
		else System.out.println("Book is unavailable");
	}
	public void display(){
        System.out.println("Title "+title);
		System.out.println("Author "+author);
		System.out.println("Price $"+price);
		System.out.println("Availability --> "+(availability?"Available":"Not Available"));
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter book title ");
		String title=sc.nextLine();
		System.out.print("Enter book author ");
		String author=sc.nextLine();
		System.out.print("Enter book price ");
		double price=sc.nextDouble();
		LibraryBook book=new LibraryBook(title,author,price);
		book.display();
		System.out.println("Borrowing book...");
		book.borrowBook();
		System.out.println();
		book.display();
	}
}
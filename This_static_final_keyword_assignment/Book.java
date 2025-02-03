import java.util.Scanner;
public class Book{
    static String libraryName="Central Library";
    final String isbn;
	String title;
	String author;
	static int bookCount=0;
	public Book(String title,String author){
	    this.title=title;
		this.author=author;
		isbn="ISBN-"+String.format("%04d",++bookCount);
	}
	public static String displayLibraryName(){
	    return libraryName;
	}
	public void displayBookDetails(){
	    if(this instanceof Book){
		    System.out.println("Library --> "+libraryName);
			System.out.println("ISBN --> "+isbn);
			System.out.println("Title --> "+title);
			System.out.println("Author --> "+author);
		}
		else System.out.println("Not a valid object");
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Book Title ");
		String title=sc.nextLine();
		System.out.print("Enter Author Name ");
		String author=sc.nextLine();
		Book book=new Book(title,author);
		book.displayBookDetails();
		System.out.println("Library Name --> "+Book.displayLibraryName());
    }
}
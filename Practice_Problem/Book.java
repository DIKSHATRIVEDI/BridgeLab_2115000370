import java.util.Scanner;
public class Book{
    String title;
    String author;
	double price;
	public Book(){
	    title="";
		author="";
		price=0.0;
	}
	public Book(String title,String author,double price){
	    this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display(){
	    System.out.println("Title --> "+title);
		System.out.println("Author --> "+author);
		System.out.println("Price --> $"+price);
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter book title ");
		String title=sc.nextLine();
		System.out.print("Enter book author ");
		String author=sc.nextLine();
		System.out.print("Enter book price ");
		double price=sc.nextDouble();
		Book book1=new Book(title,author,price); 
		Book book2=new Book(); 
		book1.display();
		System.out.println(); 
		book2.display();
	}
}
import java.util.Scanner;
public class Book{
    String title;
    String author;
	double price;
	public Book(String title,String author,double price){
	    this.title=title;
		this.author=author;
		this.price=price;
	}
	public void display(){
	    System.out.println("Title --> "+title);
		System.out.println("Author --> "+author);
		System.out.println("Price --> "+price);
	}
  	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter title ");
		String title=sc.nextLine();
		System.out.print("Enter author ");
		String author=sc.nextLine();
		System.out.print("Enter price ");
		double price=sc.nextDouble();
		Book ob=new Book(title,author,price);
		ob.display();
	}
}
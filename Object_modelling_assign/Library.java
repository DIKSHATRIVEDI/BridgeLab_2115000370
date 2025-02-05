import java.util.*;
class Book{
    String title;
    String author;
	public Book(String title,String author){
        this.title=title;
		this.author=author;
	}
	public String getTitle(){
	    return title;
	}
	public String getAuthor(){
        return author;
	}
}
class Library{
	private List<Book> books;
	public Library(){
	    books=new ArrayList<>();
	}
	public void addBook(Book book){
        books.add(book);
	}
	public void displayBooks(){
        for(Book book:books)
		System.out.println("Title --> "+book.getTitle()+", Author --> "+book.getAuthor());
	}
	public static void main(String[] args){
        Book book1=new Book("The Hobbit", "J.R.R. Tolkien");
		Book book2=new Book("Pride and Prejudice", "Jane Austen");
		Book book3=new Book("The Alchemist", "Paulo Coelho");
		Library library1=new Library();
		Library library2=new Library();
		library1.addBook(book1);
		library1.addBook(book2);
		library2.addBook(book3);
		System.out.println("Books in Library 1 ");
		library1.displayBooks();
		System.out.println("\nBooks in Library 2 ");
		library2.displayBooks();
    }
}


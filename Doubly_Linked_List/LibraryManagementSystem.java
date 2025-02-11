class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book prev;
    Book next;
    public Book(String title, String author, String genre, int bookId) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = true;
        this.prev = null;
        this.next = null;
    }
}

public class LibraryManagementSystem {
    Book head;
    Book tail; 
    public LibraryManagementSystem() {
        head = null;
        tail = null;
    }
    public void addBookAtBeginning(String title, String author, String genre, int bookId) {
        Book newBook = new Book(title, author, genre, bookId);
        if (head == null) {
            head = newBook;
            tail = newBook;
            return;
        }
        newBook.next = head;
        head.prev = newBook;
        head = newBook;
    }
    public void addBookAtEnd(String title, String author, String genre, int bookId) {
        Book newBook = new Book(title, author, genre, bookId);
        if (head == null) {
            head = newBook;
            tail = newBook;
            return;
        }
        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookId);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId);
        Book current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newBook.next = current.next;
        newBook.prev = current;
        current.next = newBook;
        if (newBook.next != null)newBook.next.prev = newBook;
        else tail = newBook;         
    }
    public void removeBook(int bookId) {
        if (head == null)return;       
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null)head.prev = null;
            else tail = null;   
            return;
        }
        if (tail.bookId == bookId) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        Book current = head;
        while (current != null && current.bookId != bookId) {
            current = current.next;
        }
        if (current == null)return;
        if (current.next != null)current.next.prev = current.prev;              
        current.prev.next = current.next;
    }
    public Book searchBook(String searchTerm) {
        Book current = head;
        while (current != null) {
            if (current.title.equals(searchTerm) || current.author.equals(searchTerm))return current;          
            current = current.next;
        }
        return null;
    }
    public void updateAvailability(int bookId, boolean isAvailable) {
        Book book = searchBookById(bookId);
        if (book != null)book.isAvailable = isAvailable;                 
    }
    public void displayBooksForward() {
        Book current = head;
        while (current != null) {
            System.out.println(getBookDetails(current));
            current = current.next;
        }
    }
    public void displayBooksReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println(getBookDetails(current));
            current = current.prev;
        }
    }
    private String getBookDetails(Book book) {
        return "Title --> " + book.title + ", Author --> " + book.author + ", Genre --> " + book.genre +", ID --> " + book.bookId + ", Available --> " + book.isAvailable;
    }
    public int countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    private Book searchBookById(int bookId) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.addBookAtEnd("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1);
        library.addBookAtEnd("Pride and Prejudice", "Jane Austen", "Romance", 2);
        library.addBookAtBeginning("1984", "George Orwell", "Dystopian", 4);
        library.addBookAtPosition(2, "To Kill a Mockingbird", "Harper Lee", "Classic", 3);
        System.out.println("Books Forward --> ");
        library.displayBooksForward();
        System.out.println("\nBooks Reverse --> ");
        library.displayBooksReverse();
        library.removeBook(2);
        System.out.println("\nBooks after removing book 2 --> ");
        library.displayBooksForward();
        library.updateAvailability(1, false);
        Book book = library.searchBook("Pride and Prejudice");
        if (book != null)System.out.println("\nFound book --> " + library.getBookDetails(book));       
        System.out.println("\nTotal books --> " + library.countBooks());
    }
}
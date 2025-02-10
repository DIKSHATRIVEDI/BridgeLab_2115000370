import java.util.ArrayList;
import java.util.List;
interface Reservable{
	void reserveItem();
	boolean checkAvailability();
}
abstract class LibraryItem{
	private String itemId;
	private String title;
	private String author;
	public LibraryItem(String itemId,String title,String author){
		this.itemId=itemId;
		this.title=title;
		this.author=author;
	}
	public String getItemId(){
		return itemId;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public abstract int getLoanDuration();
	public String getItemDetails(){
		return "ID --> "+itemId+", Title --> "+title+", Author --> "+author;
	}
}
class Book extends LibraryItem implements Reservable{
	private int numberOfPages;
	private boolean isReserved;
	public Book(String itemId,String title,String author,int numberOfPages){
		super(itemId,title,author);
		this.numberOfPages=numberOfPages;
	    this.isReserved=false;
	}
	@Override
	public int getLoanDuration(){
		return 21;
	}
	@Override
	public void reserveItem(){
		isReserved=true;
		System.out.println(getTitle()+" is now reserved");
	}
	@Override
	public boolean checkAvailability(){
		return !isReserved;
	}
	public int getNumberOfPages(){
		return numberOfPages;
	}
}
class Magazine extends LibraryItem{
	private int issueNumber;
	public Magazine(String itemId,String title,String author,int issueNumber){
		super(itemId,title,author);
		this.issueNumber=issueNumber;
	}
	@Override
	public int getLoanDuration(){
		return 7;
	}
	public int getIssueNumber(){
		return issueNumber;
	}
}
class DVD extends LibraryItem implements Reservable{
	private int runningTime;
	private boolean isReserved;
	public DVD(String itemId,String title,String author,int runningTime){
		super(itemId,title,author);
		this.runningTime=runningTime;
		this.isReserved=false;
	}
	@Override
	public int getLoanDuration(){
		return 7;
	}
	@Override
	public void reserveItem(){
		isReserved=true;
		System.out.println(getTitle()+" is now reserved.");
	}
	@Override
	public boolean checkAvailability(){
		return !isReserved;
	}
	public int getRunningTime(){
		return runningTime;
	}
}
public class LibraryManagementSystem{
	public static void main(String[] args){
		List<LibraryItem> items=new ArrayList<>();
		items.add(new Book("Book-2","Pride and Prejudice","Jane Austen",432));
		items.add(new Magazine("Mag-2","Time","Various",25));
		items.add(new DVD("DVD-2","Interstellar","Christopher Nolan",169));
		items.add(new Book("Book-3","The Hitchhiker's Guide to the Galaxy","Douglas Adams",224));
		items.add(new DVD("DVD-3","The Shawshank Redemption","Frank Darabont",142));
		for(LibraryItem item:items){
			System.out.println(item.getItemDetails());
			System.out.println("Loan Duration --> "+item.getLoanDuration()+" days");
	
			if(item instanceof Reservable){
				Reservable reservableItem=(Reservable)item;
				if(reservableItem.checkAvailability())System.out.println(item.getTitle()+" is available");
				else System.out.println(item.getTitle()+" is not available");
				reservableItem.reserveItem();
				if(reservableItem.checkAvailability())System.out.println(item.getTitle()+" is available");
				else System.out.println(item.getTitle()+" is not available");
				System.out.println();
            }
		}
		System.out.println();
	}
}

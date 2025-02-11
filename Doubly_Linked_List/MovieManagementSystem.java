class MovieNode{
    String title;
	String director;
	int year;
	double rating;
	MovieNode next;
	MovieNode prev;
	public MovieNode(String title,String director,int year,double rating){
	    this.title=title;
		this.director=director;
		this.year=year;
		this.rating=rating;
		this.next=null;
		this.prev=null;
	}
}
class MovieManagementSystem{
    MovieNode head;
	MovieNode tail;
	public MovieManagementSystem(){
	    head=null;
		tail=null;
	}
	public void addMovieAtBeginning(String title,String director,int year,double rating){
	    MovieNode newNode=new MovieNode(title,director,year,rating);
		if(head==null){
		    head=newNode;
			tail=newNode;
		}
		else{
		    newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void addMovieAtEnd(String title,String director,int year,double rating){
		MovieNode newNode=new MovieNode(title,director,year,rating);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}
	public void addMovieAtPosition(String title,String director,int year,double rating,int position){
		if(position<1){
			System.out.println("Invalid position");
			return;
		}
		MovieNode newNode=new MovieNode(title,director,year,rating);
		if(position==1)addMovieAtBeginning(title,director,year,rating);
		else{
			MovieNode current=head;
			int count=1;
			while(current!=null&&count<position-1){
				current=current.next;
				count++;
			}
			if(current==null)System.out.println("Invalid position");
			else{
				newNode.next=current.next;
				if(current.next!=null)current.next.prev=newNode;
				else tail=newNode;
				newNode.prev=current;
				current.next=newNode;
			}
		}
	}
	public void removeMovie(String title){
		MovieNode current=head;
		while(current!=null){
			if(current.title.equals(title)){
				if(current==head){
					head=current.next;
					if(head!=null)head.prev=null;
					else tail=null;
				}
				else if(current==tail){
					tail=current.prev;
					tail.next=null;
				}
				else{
					current.prev.next=current.next;
					current.next.prev=current.prev;
				}
				break;
			}
			current=current.next;
		}
	}
	public void searchByDirector(String director){
		MovieNode current=head;
		System.out.println("Movies directed by "+director+" --> ");
		while(current!=null){
			if(current.director.equals(director))System.out.println("Title --> "+current.title+", Year --> "+current.year+", Rating --> "+current.rating);
			current=current.next;
		}
	}
    public void searchByRating(double rating){
	    MovieNode current=head;
		System.out.println("Movies with rating "+rating+" --> ");
		while(current!=null){
		    if(current.rating==rating)System.out.println("Title --> "+current.title+", Director --> "+current.director+", Year --> "+current.year);
		    current=current.next;
		}
	}
	public void displayForward(){
	    MovieNode current=head;
		System.out.println("Movies Forward --> ");
		while(current!=null){
		    System.out.println("Title --> "+current.title+", Director --> "+current.director+", Year --> "+current.year+", Rating --> "+current.rating);
			current=current.next;
		}
	}
	public void displayReverse(){
	    MovieNode current=tail;
		System.out.println("Movies Reverse --> ");
		while(current!=null){
            System.out.println("Title --> "+current.title+", Director --> "+current.director+", Year --> "+current.year+", Rating --> "+current.rating);
			current=current.prev;
		}
	}
	public void updateRating(String title,double newRating){
	    MovieNode current=head;
		while(current!=null){
		    if(current.title.equals(title)){
			    current.rating=newRating;
			    break;
			}
			current=current.next;
		}
	}
	public static void main(String[] args){
		MovieManagementSystem movieList=new MovieManagementSystem();
		movieList.addMovieAtEnd("The Shawshank Redemption","Frank Darabont",1994,9.3);
		movieList.addMovieAtBeginning("The Godfather","Francis Ford Coppola",1972,9.2);
		movieList.addMovieAtPosition("The Dark Knight","Christopher Nolan",2008,9.0,2);
		movieList.displayForward();
		System.out.println();
		movieList.displayReverse();
		System.out.println();
		movieList.searchByDirector("Christopher Nolan");
		System.out.println();
		movieList.searchByRating(9.2);
		System.out.println();
		movieList.removeMovie("The Godfather");
		System.out.println();
		movieList.displayForward();
		System.out.println();
		movieList.updateRating("The Shawshank Redemption",9.4);
		System.out.println("After updating rating\n");
		movieList.displayForward();
	}
}

class TicketNode{
	String ticketId;
	String customerName;
	String movieName;
	String seatNumber;
	String bookingTime;
	TicketNode next;
	public TicketNode(String ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
		this.ticketId=ticketId;
		this.customerName=customerName;
		this.movieName=movieName;
		this.seatNumber=seatNumber;
		this.bookingTime=bookingTime;
		this.next=null;
	}
}
class ReservationSystem{
	TicketNode head;
	public ReservationSystem(){
		head=null;
	}
	public void addReservation(String ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
		TicketNode newNode=new TicketNode(ticketId,customerName,movieName,seatNumber,bookingTime);
		if(head==null){
			head=newNode;
			newNode.next=head;
		}
		else{
			TicketNode last=head;
			while(last.next!=head){
				last=last.next;
			}
			last.next=newNode;
		    newNode.next=head;
		}
	}
    public void removeReservation(String ticketId){
		if(head==null){
			System.out.println("No reservations found");
			return;
		}
		TicketNode current=head;
		TicketNode prev=null;
		do{
			if(current.ticketId.equals(ticketId)){
				if(current==head&&current.next==head)head=null;
				else if(current==head)head=current.next;
				if(prev!=null)prev.next=current.next;
				break;
			}
			prev=current;
			current=current.next;
		}while(current!=head);
	}
	public void displayAllReservations(){
		if(head==null){
			System.out.println("No reservations found");
			return;
		}
		TicketNode current=head;
		System.out.println("All Reservations --> ");
		do{
			System.out.println("Ticket ID --> "+current.ticketId+", Customer --> "+current.customerName+", Movie --> "+current.movieName+", Seat --> "+current.seatNumber+", Time --> "+current.bookingTime);
			current=current.next;
		}while(current!=head);
	}
	public void searchByCustomer(String customerName){
		if(head==null){
			System.out.println("No reservations found");
			return;
		}
		TicketNode current=head;
		System.out.println("Reservations for "+customerName+" --> ");
		do{
			if(current.customerName.equals(customerName))System.out.println("Ticket ID --> "+current.ticketId+", Movie --> "+current.movieName+", Seat --> "+current.seatNumber+", Time --> "+current.bookingTime);
			current=current.next;
		}while(current!=head);
	}
	public void searchByMovie(String movieName){
		if(head==null){
			System.out.println("No reservations found");
			return;
		}
		TicketNode current=head;
		System.out.println("Reservations for "+movieName+" --> ");
		do{
			if(current.movieName.equals(movieName))System.out.println("Ticket ID --> "+current.ticketId+", Customer --> "+current.customerName+", Seat --> "+current.seatNumber+", Time --> "+current.bookingTime);
			current=current.next;
		}while(current!=head);
	}
	public int getTotalReservations(){
		if(head==null)return 0;
		int count=0;
		TicketNode current=head;
		do{
			count++;
			current=current.next;
		}while(current!=head);
		return count;
	}
    public static void main(String[] args){
		ReservationSystem system=new ReservationSystem();
		system.addReservation("T-1","Hema","Annabella","A1","11-02-2025 10:00");
		system.addReservation("T-2","Rekha","Conjuring","B2","17-02-2025 12:00");
		system.addReservation("T-3","Jaya","The Nun","A3","08-02-2025 10:00");
		system.displayAllReservations();
		System.out.println();
		system.searchByCustomer("Rekha");
		System.out.println();
		system.searchByMovie("Annabella");
		System.out.println();
		System.out.println("Total Reservations --> "+system.getTotalReservations());
		System.out.println();
		system.removeReservation("T-2");
		System.out.println("After removing T-2 reservation \n");
		system.displayAllReservations();
	}
}

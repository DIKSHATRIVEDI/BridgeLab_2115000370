import java.util.Scanner;
public class CarRental{
    String customerName;
	String carModel;
	int rentalDays;
	double pricePerDay;
	public CarRental(String customerName,String carModel,int rentalDays){
	    this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
	}
	public double calculateTotalCost(){
	    if(carModel.equalsIgnoreCase("Economy"))
		return rentalDays*50.0;
		else if(carModel.equalsIgnoreCase("Midsize"))
		return rentalDays*75.0;
		else if(carModel.equalsIgnoreCase("Luxury"))
		return rentalDays*100.0;
		else 
		return 0.0; 
	}
	public void display(){
	    System.out.println("Customer Name --> "+customerName);
		System.out.println("Car Model --> "+carModel);
		System.out.println("Rental Days --> "+rentalDays);
		System.out.println("Total Cost --> $"+calculateTotalCost());
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer name ");
		String customerName=sc.nextLine();
		System.out.print("Enter car model Economy, Midsize, Luxury ");
		String carModel=sc.nextLine();
		System.out.print("Enter number of rental days ");
		int rentalDays=sc.nextInt();
		CarRental rental=new CarRental(customerName,carModel,rentalDays);
		rental.display();
    }
}
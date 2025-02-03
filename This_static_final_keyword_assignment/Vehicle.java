import java.util.Scanner;
public class Vehicle{
    static double registrationFee=500.0;
    final String registrationNumber;
	String ownerName;
	String vehicleType;
	static int vehicleCount=0;
	public Vehicle(String ownerName,String vehicleType){
	    this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		registrationNumber="Vehicle "+String.format("%03d",++vehicleCount);
	}
	public static void updateRegistrationFee(double newFee){
	    registrationFee=newFee;
	}
	public void display(){
	    if(this instanceof Vehicle){
		    System.out.println("Registration Number --> "+registrationNumber);
			System.out.println("Owner Name --> "+ownerName);
			System.out.println("Vehicle Type --> "+vehicleType);
			System.out.println("Registration Fee --> $"+registrationFee);
		}
		else System.out.println("Not a valid object");
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Owner Name ");
		String ownerName=sc.nextLine();
		System.out.print("Enter Vehicle Type ");
		String vehicleType=sc.nextLine();
		Vehicle vehicle=new Vehicle(ownerName,vehicleType);
		vehicle.display();
		System.out.println("Current Registration Fee --> $"+registrationFee);
		System.out.print("Enter new Registration Fee --> ");
		double newFee=sc.nextDouble();
		Vehicle.updateRegistrationFee(newFee);
		System.out.println("Updated Registration Fee --> $"+registrationFee);
    }
}
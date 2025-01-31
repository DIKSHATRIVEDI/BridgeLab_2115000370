import java.util.Scanner;
public class Vehicle{
    String ownerName;
	String vehicleType;
	static double registrationFee=500.0;
	public Vehicle(String ownerName,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	public void displayVehicleDetails(){
		System.out.println("Owner Name "+ownerName);
		System.out.println("Vehicle Type "+vehicleType);
		System.out.println("Registration Fee $"+registrationFee);
	}
	public static void updateRegistrationFee(double newFee){
		registrationFee=newFee;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter owner name ");
		String ownerName=sc.nextLine();
		System.out.print("Enter vehicle type ");
		String vehicleType=sc.nextLine();
		Vehicle vehicle=new Vehicle(ownerName,vehicleType);
		vehicle.displayVehicleDetails();
		System.out.print("Enter new registration fee ");
		double newFee=sc.nextDouble();
		Vehicle.updateRegistrationFee(newFee);
		vehicle.displayVehicleDetails();
	}
}
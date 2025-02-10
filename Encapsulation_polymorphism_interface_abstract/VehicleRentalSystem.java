import java.util.*;
interface Insurable{
    double calculateInsurance();
	String getInsuranceDetails();
}
abstract class Vehicle implements Insurable{
    private String vehicleNumber;
	private String type;
	protected double rentalRate;
	private String insurancePolicyNumber;
	public Vehicle(String vehicleNumber,String type,double rentalRate,String insurancePolicyNumber){
	    this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
		this.insurancePolicyNumber=insurancePolicyNumber;
	}
	public abstract double calculateRentalCost(int days);
	@Override
	public double calculateInsurance(){
	    return rentalRate*0.1;
	}
	@Override
	public String getInsuranceDetails(){
	    return "Insurance Policy --> Confidential";
	}
	public String getDetails(){
	    return "Vehicle Number --> "+vehicleNumber+", Type --> "+type;
	}
}
class Car extends Vehicle{
    public Car(String vehicleNumber,double rentalRate,String insurancePolicyNumber){
        super(vehicleNumber,"Car",rentalRate,insurancePolicyNumber);
    }
	@Override
	public double calculateRentalCost(int days){
	    return days*rentalRate;
	}
}
class Bike extends Vehicle{
    public Bike(String vehicleNumber,double rentalRate,String insurancePolicyNumber){
	    super(vehicleNumber,"Bike",rentalRate,insurancePolicyNumber);
	}
	@Override
	public double calculateRentalCost(int days){
	    return days*rentalRate*0.9;
	}
}
class Truck extends Vehicle{
    public Truck(String vehicleNumber,double rentalRate,String insurancePolicyNumber){
	    super(vehicleNumber,"Truck",rentalRate,insurancePolicyNumber);
	}
	@Override
	public double calculateRentalCost(int days){
	    return days*rentalRate*1.2;
	}
}
public class VehicleRentalSystem{
    public static void main(String[] args){
        List<Vehicle> vehicles=new ArrayList<>();
		vehicles.add(new Car("CAR1",60,"UP46"));
		vehicles.add(new Bike("BIKE1",30,"UP47"));
		vehicles.add(new Truck("TRUCK1",90,"UP49"));
		int rentalDays=8;
		for(Vehicle vehicle:vehicles){
		    System.out.println(vehicle.getDetails());
			System.out.println("Rental Cost for "+rentalDays+" days --> $"+vehicle.calculateRentalCost(rentalDays));
			System.out.println("Insurance Cost --> $"+vehicle.calculateInsurance());
			System.out.println(vehicle.getInsuranceDetails());
			System.out.println();
		}
	}
}
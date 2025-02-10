import java.util.ArrayList;
import java.util.List;
interface GPS{
	String getCurrentLocation();
	void updateLocation(String newLocation);
}
abstract class Vehicle implements GPS{
	private String vehicleId;
	private String driverName;
	private double ratePerKm;
	private String currentLocation;
	public Vehicle(String vehicleId,String driverName,double ratePerKm){
		this.vehicleId=vehicleId;
		this.driverName=driverName;
		this.ratePerKm=ratePerKm;
		this.currentLocation="Lucknow";
	}
	public String getVehicleId(){
		return vehicleId;
	}
	public String getDriverName(){
		return driverName;
	}
	public double getRatePerKm(){
		return ratePerKm;
	}
	public abstract double calculateFare(double distance);
	public String getVehicleDetails(){
		return "ID --> "+vehicleId+", Driver --> "+driverName+", Rate --> $"+ratePerKm+"/km";
	}
	@Override
	public String getCurrentLocation(){
		return currentLocation;
	}
	@Override
	public void updateLocation(String newLocation){
		this.currentLocation=newLocation;
	}
}
class Car extends Vehicle{
	public Car(String vehicleId,String driverName,double ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	@Override
	public double calculateFare(double distance){
		return distance*getRatePerKm();
	}
}
class Bike extends Vehicle{
	public Bike(String vehicleId,String driverName,double ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	@Override
	public double calculateFare(double distance){
		return distance*getRatePerKm()*0.8;
	}
}
class Auto extends Vehicle{
	public Auto(String vehicleId,String driverName,double ratePerKm){
		super(vehicleId,driverName,ratePerKm);
	}
	@Override
	public double calculateFare(double distance){
		return distance*getRatePerKm()*0.9;
	}
}
public class RideHailingApp{
	public static void main(String[] args){
		List<Vehicle> vehicles=new ArrayList<>();
		vehicles.add(new Car("Car-1","Rani",9.7));
		vehicles.add(new Bike("Bike-1","Mani",8.5));
		vehicles.add(new Auto("Auto-1","Sani",9.1));
		double distance=10.0;
		for(Vehicle vehicle:vehicles){
			System.out.println(vehicle.getVehicleDetails());
			System.out.println("Current Location --> "+vehicle.getCurrentLocation());
			vehicle.updateLocation("New Jersey");
			System.out.println("Updated Location --> "+vehicle.getCurrentLocation());
			double fare=vehicle.calculateFare(distance);
			System.out.println("Fare for "+distance+" km --> $"+fare);
			System.out.println();
		}
	}
}
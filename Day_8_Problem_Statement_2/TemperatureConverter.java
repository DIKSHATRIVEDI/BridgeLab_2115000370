import java.util.Scanner;
public class TemperatureConverter{
    public static double fahrenheitToCelsius(double fahrenheit){
	    return (fahrenheit-32)*5/9;
	}
	public static double celsiusToFahrenheit(double celsius){
	    return (celsius*9/5)+32;
	}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
		System.out.print("Enter choice ");
		int choice=sc.nextInt();
		System.out.print("Enter temperature ");
		double temperature=sc.nextDouble();
		double newTemperature=0.0;
		if(choice==1)newTemperature=fahrenheitToCelsius(temperature);
		else if(choice==2)newTemperature=celsiusToFahrenheit(temperature);
		else{
		    System.out.println("Invalid choice");
			return;
		}
		System.out.println("Temperature --> "+newTemperature);
	}
}
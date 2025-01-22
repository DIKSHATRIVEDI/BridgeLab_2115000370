import java.util.*;
public class TemperatureConversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter Temperature in Celsius ");
	double celsius=sc.nextDouble();
	double farenheitResult=(celsius*9/5)+32;
	System.out.println("The " + celsius + " Celsius is " + farenheitResult + " Fahrenheit");
    }
}

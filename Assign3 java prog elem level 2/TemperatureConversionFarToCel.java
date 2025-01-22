import java.util.*;
public class TemperatureConversionFarToCel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit ");
        double fahrenheit=sc.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}


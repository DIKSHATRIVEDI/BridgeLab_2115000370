import java.util.*;
public class AthleteTriangularPark{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side  ");
        double side1=sc.nextDouble();
        System.out.print("Enter second side  ");
        double side2=sc.nextDouble();
        System.out.print("Enter third side  ");
        double side3=sc.nextDouble();
        double perimeter=side1+side2+side3;
        double totalDistance=5000.0;
        double rounds=totalDistance/perimeter;
        System.out.println("The total number of rounds the athlete will run is " + (int)Math.ceil(rounds) + " to complete 5 km.");
    }
}

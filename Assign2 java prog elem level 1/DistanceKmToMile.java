import java.util.Scanner;
public class DistanceKmToMile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distence in km ");   
        double km=sc.nextDouble();
        double mile=km/1.6;
        System.out.println("The total miles is "+mile+" miles for the given "+km+" km");
    }
}

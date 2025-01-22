import java.util.Scanner;
public class distanceYardsMiles{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
	System.out.println("Enter Distance in Feet");
        double distanceInFeet=input.nextDouble();
        double distanceYards=distanceInFeet/3;
        double distanceMiles=distanceYards/1760;
        System.out.println("Your distance in feet is "+distanceInFeet+" while in yards is "+distanceYards+" and miles is "+distanceMiles);
    }
}

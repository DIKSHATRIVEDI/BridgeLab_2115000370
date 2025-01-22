import java.util.Scanner;
public class PerimeterOfSquare{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
	System.out.println("Enter Perimeter");
        double perimeter=input.nextDouble();
        double sides=perimeter/4;
        System.out.println("The length of the side is "+sides+" whose perimeter is "+perimeter);
    }
}

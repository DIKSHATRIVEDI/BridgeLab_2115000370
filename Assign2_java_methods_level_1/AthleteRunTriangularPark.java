import java.util.Scanner;
public class AthleteRunTriangularPark{
    public static double perimeter(double side1,double side2,double side3){
        return side1+side2+side3;
    }
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("First side length ");
		double side1=sc.nextDouble();
		System.out.print("Second side length ");
		double side2=sc.nextDouble();
		System.out.print("Third side length ");
		double side3=sc.nextDouble();
		double distance=5000; 
		double rounds=distance/perimeter(side1,side2,side3);
		System.out.println("Number of rounds needed "+Math.ceil(rounds));
	}
}
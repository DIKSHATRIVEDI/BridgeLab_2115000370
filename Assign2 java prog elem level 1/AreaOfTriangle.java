import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
	System.out.println("Enter Base");
        double base=input.nextDouble();
	System.out.println("Enter Height");
        double height=input.nextDouble();
        double areaInInches=0.5*base*height;
        double areaInCm=areaInInches*6.4516;
        System.out.println("The area of the triangle is "+areaInInches+" square inches and "+areaInCm+" square centimeters");
    }
}

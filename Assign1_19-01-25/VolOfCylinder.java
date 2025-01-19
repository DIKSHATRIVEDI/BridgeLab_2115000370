import java.util.*;
public class VolOfCylinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
	    double r=sc.nextDouble();
		System.out.println("Enter Height");
		double h=sc.nextDouble();
		double pi=3.14;
		double v=pi*r*r*h;
       	System.out.println("Volume = " +v);
	}
}

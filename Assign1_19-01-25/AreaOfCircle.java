import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
	    double r=sc.nextDouble();
		double pi=3.14;
		double a=pi*r*r;
       	System.out.println("Area = " +a);
	}
}

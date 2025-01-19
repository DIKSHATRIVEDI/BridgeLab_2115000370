import java.util.*;
public class PerimeterRect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
	    double l=sc.nextDouble();
		System.out.println("Enter Width");
		double b=sc.nextDouble();
		double peri=2*(l+b);
       	System.out.println("Perimeter = " +peri);
	}
}

import java.util.*;
public class KiloToMile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance in Kilometer");
	    double d=sc.nextDouble();
		double m=d*0.621371;
       	System.out.println("Miles = " +m);
	}
}

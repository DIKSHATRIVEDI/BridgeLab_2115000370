import java.util.*;
public class Calculation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base");
	    double b=sc.nextDouble();
		System.out.println("Enter Expponent");
		double e=sc.nextDouble();
		double res=Math.pow(b, e);
       	System.out.println("Answer is = " +res);
	}
}

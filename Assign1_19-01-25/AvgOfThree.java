import java.util.*;
public class AvgOfThree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no.s");
	    double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double avg=(a+b+c)/3;
       	System.out.println("Average is = " +avg);
	}
}

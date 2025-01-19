import java.util.*;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal");
		int p=sc.nextInt();
		System.out.println("Enter Rate");
		double r=sc.nextDouble();
		System.out.println("Enter Time");
		int t=sc.nextInt();
		double si=(p*r*t)/100;
       	System.out.println("Simple Interest = " +si);
	}
}

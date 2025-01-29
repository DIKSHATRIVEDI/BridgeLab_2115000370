import java.util.Scanner;
public class GCDandLCM{
    public static int calculateGCD(int a,int b){
	    if(b==0)return a;
		return calculateGCD(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number ");
		int number1=sc.nextInt();
		System.out.print("Enter second number ");
		int number2=sc.nextInt();
		int gcd=calculateGCD(number1,number2);
		int lcm=(number1*number2)/gcd;
		System.out.println("GCD--> "+gcd);
		System.out.println("LCM--> "+lcm);
	}
}
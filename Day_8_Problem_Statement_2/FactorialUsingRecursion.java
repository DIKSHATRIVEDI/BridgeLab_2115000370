import java.util.Scanner;
public class FactorialUsingRecursion{
    public static int factorial(int number){
	    if(number==0)return 1;
		else return number*factorial(number-1);
	}
	public static void display(int number,int factorial){
	    System.out.println("Factorial is "+factorial);
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		if(number<0)System.out.println("Not for negative numbers");
		else{
		    int factorialAnswer=factorial(number);
			display(number,factorialAnswer);
		}
	}
}
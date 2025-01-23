import java.util.Scanner;
public class SumOfNaturalNumbersFor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter a natural number ");
	int n=sc.nextInt();
	int sum=0;
	if(n>0){
            for(int i=1;i<=n;i++)sum=sum+i;
	        int formulae=n*(n+1)/2;
	        if(sum==formulae){
		    System.out.println("Sum of "+n+" natural numbers using while loop "+sum);
		    System.out.println("Sum of "+n+" natural numbers using formula "+sum);
		    System.out.println("Computations are correct.");
		}
		else System.out.println("Error in computation.");
            }
	else System.out.println("Please enter a natural number.");
    }
}

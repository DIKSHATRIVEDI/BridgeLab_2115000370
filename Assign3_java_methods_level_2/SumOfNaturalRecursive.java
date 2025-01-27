import java.util.Scanner;
public class SumOfNaturalRecursive{
    public static int sumRecursive(int n){
	    if(n==1)return 1;
		else return n+sumRecursive(n-1);
	}
	public static int sumFormula(int n){
	    return n*(n+1)/2;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a natural number ");
		int n=sc.nextInt();
		if(n<=0){
		    System.out.println("Enter a natural number");
			return;
		}
		int recursiveSum=sumRecursive(n);
		int formulaSum=sumFormula(n);
		if(recursiveSum==formulaSum){
		    System.out.println("Sum of "+n+" natural numbers using recursion "+recursiveSum);
			System.out.println("Sum of "+n+" natural numbers using formula "+formulaSum);
			System.out.println("Both computations are correct.");
		}
		else System.out.println("Error in computation.");
	}
}
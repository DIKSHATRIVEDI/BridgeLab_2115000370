import java.util.Scanner;
public class FindFactors{
    public static int sumOfSquaresOfFactors(int[] factors){
	    int sumOfSquares=0;
	    for(int i=0;i<factors.length;i++)sumOfSquares+=(int)Math.pow(factors[i],2);
	    return sumOfSquares;
	}
    public static int sumOfFactors(int[] factors){
	    int sum=0;
		for(int i=0;i<factors.length;i++)sum+=factors[i];
		return sum;
	}
	public static int productOfFactors(int[] factors){
	    int product=1;
		for(int i=0;i<factors.length;i++)product*=factors[i];
		return product;
	}
    public static int[] Factors(int number){
	    int count=0;
		for(int i=1;i<=number/2;i++)if(number%i==0)count++;
		int[] factors=new int[count];
		int index=0;
		for(int i=1;i<=number/2;i++){
		    if(number%i==0)factors[index++]=i;
		}
		return factors;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int[] factors=Factors(number);
		System.out.print("Factors of "+number+" are ");
		for(int i=0;i<factors.length;i++)System.out.print(factors[i]+" ");
		System.out.println();
		System.out.println("Sum of factors "+sumOfFactors(factors));
		System.out.println("Product of factors "+productOfFactors(factors));
		System.out.println("Sum of squares of factors "+sumOfSquaresOfFactors(factors));
	}
}
import java.util.*;
public class NumberChecker5{
    public static boolean isPrime(int number){
        if(number<=1)return false;
		for(int i=2;i<=Math.sqrt(number);i++){
		    if(number%i==0)return false;
		}
		return true;
	}
	public static boolean isNeon(int number){
	    int square=number*number;
		int sum=0;
		while(square>0){
		    sum+=square%10;
			square/=10;
		}
		return sum==number;
	}
	public static boolean isSpy(int number){
	    int sum=0;
		int product=1;
		int temp=number;
		while(temp>0){
		    int digit=temp%10;
			sum+=digit;
			product*=digit;
			temp/=10;
		}
		return sum==product;
	}
	public static boolean isAutomorphic(int number){
	    int square=number*number;
		String numString=Integer.toString(number);
		String squareString=Integer.toString(square);
		return squareString.endsWith(numString);
	}
	public static boolean isBuzz(int number){
	    return (number%7==0)||(number%10==7);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = sc.nextInt();
		System.out.println("Prime "+isPrime(number));
		System.out.println("Neon "+isNeon(number));
		System.out.println("Spy "+isSpy(number));
		System.out.println("Automorphic "+isAutomorphic(number));
		System.out.println("Buzz "+isBuzz(number));
	}
}
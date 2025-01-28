import java.util.Scanner;
public class NumberCheckerHarshad{
    public static int countDigits(int number){
	    int count=0;
		while(number!=0){
		    number/=10;
			count++;
		}
	    return count;
	}
	public static int[] storeDigits(int number,int count){
	    int[] digits=new int[count];
		int i=count-1;
		while(number!=0){
		    digits[i]=number%10;
			number/=10;
		    i--;
		}
		return digits;
	}
    public static int sumOfDigits(int[] digits){
	    int sum=0;
		for(int digit:digits)sum+=digit;
		return sum;
	}
	public static int sumOfSquaresOfDigits(int[] digits){
	    int sum=0;
		for(int digit:digits)sum+=(int)Math.pow(digit,2);
		return sum;
	}
	public static boolean isHarshadNumber(int number,int[] digits){
	    int sum=sumOfDigits(digits);
		return number%sum==0;
	}
	public static int[][] findDigitFrequencies(int[] digits){
	    int[][] frequencies=new int[10][2];
		for(int digit:digits){
		    frequencies[digit][0]=digit;
			frequencies[digit][1]++;
		}
		return frequencies;
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int digitCount=countDigits(number);
		int[] digits=storeDigits(number,digitCount);
		System.out.println("Number of digits "+digitCount);
		System.out.println("Sum of digits "+sumOfDigits(digits));
		System.out.println("Sum of squares of digits "+sumOfSquaresOfDigits(digits));
		System.out.println("Is Harshad number "+isHarshadNumber(number,digits));
		System.out.println("Digit Frequencies ");
		int[][] frequencies=findDigitFrequencies(digits);
		for(int[] freq:frequencies)if(freq[1]>0)System.out.println(freq[0]+" "+freq[1]+" times");
    }
}
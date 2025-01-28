import java.util.Scanner;
public class NumberChecker{
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
	public static boolean checkDuckNumber(int[] digits){
	    for(int digit:digits){
		    if(digit!=0)return true;
		}
		return false;
	}
	public static boolean checkArmstrongNumber(int number,int[] digits){
	    int sum=0;
		int count=digits.length;
		for(int digit:digits)sum+=Math.pow(digit,count);
		return sum==number;
	}
	public static int[] largestAndSecondLargest(int[] digits){
	    int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int digit:digits){
		    if(digit>largest){
			    secondLargest=largest;
				largest=digit;
			}
			else if(digit>secondLargest&&digit!=largest)secondLargest=digit;
		}
		return new int[]{largest,secondLargest};
	}
	public static int[] checkSmallestAndSecondSmallest(int[] digits){
	    int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int digit:digits){
		    if(digit<smallest){
			    secondSmallest=smallest;
				smallest=digit;
			}
			else if(digit<secondSmallest&&digit!=smallest)secondSmallest=digit;
		}
		return new int[]{smallest,secondSmallest};
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int digitCount=countDigits(number);
		int[] digits=storeDigits(number,digitCount);
		System.out.println("Duck Number -->"+checkDuckNumber(digits));
		System.out.println("Armstrong Number -->"+checkArmstrongNumber(number,digits));
		int[] largestTwo=largestAndSecondLargest(digits);
		System.out.println("Largest digit "+largestTwo[0]);
		System.out.println("Second Largest digit "+largestTwo[1]);
		int[] smallestTwo=checkSmallestAndSecondSmallest(digits);
		System.out.println("Smallest digit "+smallestTwo[0]);
		System.out.println("Second Smallest digit "+smallestTwo[1]);
	}
}
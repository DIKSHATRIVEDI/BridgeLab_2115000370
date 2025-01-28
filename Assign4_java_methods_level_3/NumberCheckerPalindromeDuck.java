import java.util.Arrays;
public class NumberCheckerPalindromeDuck{
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
	public static int[] reverseDigits(int[] digits){
	    int[] reversed=new int[digits.length];
		for(int i=0;i<digits.length;i++)reversed[i]=digits[digits.length-1-i];
		return reversed;
	}
	public static boolean EqualityOfArray(int[] arr1,int[] arr2){
	    if(arr1.length!=arr2.length)return false;
		for(int i=0;i<arr1.length;i++){
		    if(arr1[i]!=arr2[i])return false;
		}
		return true;
	}
	public static boolean isPalindrome(int[] original,int[] reversed){
	    return EqualityOfArray(original,reversed);
	}
	public static boolean isDuckNumber(int[] digits){
	    for(int digit:digits){
		    if(digit!=0)return true;
		}
	    return false;
	}
	public static void main(String[] args){
        int number=121;
		int digitCount=countDigits(number);
		int[] digits=storeDigits(number,digitCount);
		int[] reversedDigits=reverseDigits(digits);
		System.out.println("Palindrome "+isPalindrome(digits,reversedDigits));
		System.out.println("Duck Number "+isDuckNumber(digits));
	}
}
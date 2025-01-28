import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dividend ");
		int dividend=sc.nextInt();
		System.out.print("Enter the divisor ");
		int divisor=sc.nextInt();
		int[] array=findRemainderAndQuotient(dividend,divisor);
		System.out.println("Quotient "+array[0]);
		System.out.println("Remainder "+array[1]);
	}
	public static int[] findRemainderAndQuotient(int dividend,int divisor){
	    int[] array=new int[2];
		array[0]=dividend/divisor;
		array[1]=dividend%divisor;
		return array;
	}
}
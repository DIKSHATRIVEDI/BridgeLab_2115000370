import java.util.*;
public class PrimeNumber{
    public static boolean prime(int number){
	    if(number<2)return false;
		for(int i=2;i*i<number;i++){
		    if(number%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(prime(number))System.out.println("Prime number");
		else System.out.println("Not a Prime number");
	}
}
import java.util.Scanner;
public class Fibonacci{
    public static void sequence(int n){
	    int first=0;
		int second=1;
		System.out.print("Fibonacci Series --> "+first+" "+second+" ");
		for(int i=2;i<n;++i){
		    int next=first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
		}
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms ");
		int n=sc.nextInt();
		sequence(n);
	}
}
import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        int count=0;
		int j=number;
        while(j!=0){
		    j=j/10;
			count++;
		}
		int[] digits=new int[count];
		int copy=number;
		for(int i=count-1;i>=0;i--){
		    digits[i]=copy%10;
			copy=copy/10;
		}
		int[] reverseDigits=new int[count];
		for(int i=0;i<count;i++)reverseDigits[i]=digits[count-1-i];
		System.out.print("Elements in Reversed order ");
		for(int i=0;i<count;i++)System.out.print(reverseDigits[i]);
    }
}
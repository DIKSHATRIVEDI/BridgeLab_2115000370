import java.util.Scanner;
public class FrequencyOfDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int count=0;
		for(int i=number;i>0;i=i/10)count++;
		int[] digits=new int[count];
		int copy=number;
		for(int i=count-1;i>=0;i--){
		    digits[i]=copy%10;
			copy=copy/10;
		}
		int[] frequency=new int[10];
		for(int i=0;i<count;i++)frequency[digits[i]]++;
		for(int i=0;i<10;i++)if(frequency[i]!=0)System.out.println("Frequency of "+i+" is "+frequency[i]);
    }
}
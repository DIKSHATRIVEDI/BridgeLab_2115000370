import java.util.Scanner;
public class MultiplicationTableOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int[] array=new int[10];
		for(int i=0;i<10;i++)array[i]=number*(i+1);
		for(int i=0;i<10;i++)System.out.println(number+" * "+(i+1)+" = "+array[i]);
    }
}
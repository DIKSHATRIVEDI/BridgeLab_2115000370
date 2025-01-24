import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int[] array=new int[4];
		for(int i=0;i<4;i++)array[i]=number*(i+6);
		for(int i=0;i<4;i++)
		    System.out.println(number+" * "+(i+6)+" = "+array[i]);
	}
}
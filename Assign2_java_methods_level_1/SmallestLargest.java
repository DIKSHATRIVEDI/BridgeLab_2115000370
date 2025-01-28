import java.util.Scanner;
public class SmallestLargest{
    public static int[] findSmallestAndLargest(int number1,int number2,int number3){
	    int[] array=new int[2];
		array[0]=Math.min(Math.min(number1,number2),number3);
		array[1]=Math.max(Math.max(number1,number2),number3);
		return array;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number ");
		int number1=sc.nextInt();
		System.out.print("Enter the second number ");
		int number2=sc.nextInt();
		System.out.print("Enter the third number ");
		int number3=sc.nextInt();
		int[] array=findSmallestAndLargest(number1,number2,number3);
		System.out.println("Smallest number "+array[0]);
		System.out.println("Largest number "+array[1]);
	}
}
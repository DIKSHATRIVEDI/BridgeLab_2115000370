import java.util.Scanner;
public class DistributeChocolate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter chocolates ");
		int chocolate=sc.nextInt();
		System.out.print("Enter children ");
		int children=sc.nextInt();
		int[] array=findRemainderAndQuotient(chocolate,children);
		System.out.println("Each child gets "+array[0]+" chocolates.");
		System.out.println("Remaining chocolates: "+array[1]);
	}
	public static int[] findRemainderAndQuotient(int number,int divisor){
    	int[] array=new int[2];
		array[0]=number/divisor; 
		array[1]=number%divisor;
		return array;
    }
}
import java.util.Scanner;
public class PositiveNegativeOrZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
		for(int i=0;i<5;i++){
		    System.out.print("Enter number "+(i+1)+" ");
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
		    if(numbers[i]>0){
			    System.out.print(numbers[i]+" is positive ");
				if(numbers[i]%2==0)System.out.println("and even");
				else System.out.println("and odd");
			}
			else if(numbers[i]<0)System.out.println(numbers[i]+" is negative");
			else System.out.println(numbers[i]+" is zero");
		}
		if(numbers[0]>numbers[4])System.out.println("First element is greater than last element");
		else if(numbers[0]<numbers[4])System.out.println("First element is less than last element");
		else System.out.println("First element is equal to last element");
    }
}
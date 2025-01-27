import java.util.Scanner;
public class CheckNumberStatus{
    public static boolean isPositive(int number){
	    return number>0;
	}
	public static boolean isEven(int number){
        return number%2==0;
	}
	public static int compare(int num1,int num2){
	    if(num1>num2)return 1;
		else if(num1<num2)return -1;
		else return 0;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		for(int i=0;i<5;i++){
		    System.out.print("Enter number "+(i+1)+" ");
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
		    if(isPositive(numbers[i])){
			    System.out.print(numbers[i]+" is positive ");
				if(isEven(numbers[i]))System.out.println("and even");
				else System.out.println("and odd");
			}
			else if(numbers[i]<0)System.out.println(numbers[i]+" is negative");
			else System.out.println(numbers[i]+" is zero");
		}
		int comparisonResult=compare(numbers[0],numbers[4]);
		if(comparisonResult==1)System.out.println("First element is greater than last element");
		else if(comparisonResult==0)System.out.println("First element is equal to last element");
		else System.out.println("First element is less than last element");
    }
}
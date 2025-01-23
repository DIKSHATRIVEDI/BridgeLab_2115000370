import java.util.Scanner;
public class SumOfNumbersUntilZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	double total=0.0;
	double userValue;
	System.out.print("Enter a number (enter 0 to stop) ");
	userValue=sc.nextDouble();
	while(userValue!=0){
	    total+=userValue;
            System.out.print("Enter a number (enter 0 to stop) ");
            userValue=sc.nextDouble();
	}
        System.out.println("Total Value is "+total);
    }
}

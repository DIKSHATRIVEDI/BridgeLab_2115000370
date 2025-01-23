import java.util.Scanner;
public class SumOfNumbersUntilZeroWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	double total=0.0;
	double userValue;
	while(true){
            System.out.print("Enter a number (enter 0 or negative no. to stop) ");
	    userValue=sc.nextDouble();
	    if(userValue<=0)break;
	    total+=userValue;
	}
        System.out.println("Total Value is "+total);
    }
}

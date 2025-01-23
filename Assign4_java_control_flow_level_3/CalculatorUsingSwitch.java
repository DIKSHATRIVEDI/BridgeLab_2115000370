import java.util.Scanner;
public class CalculatorUsingSwitch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number ");
	double first=sc.nextDouble();
	System.out.print("Enter second number ");
	double second=sc.nextDouble();
	System.out.print("Enter operator from only (+, -, *, /) ");
	String op=sc.next();
	double ans=0;
	switch(op){
	    case "+":
                ans=first+second;
		break;
            case "-":
                ans=first-second;
                break;
            case "*":
                ans=first*second;
                break;
            case "/":
                if(second!=0)ans=first/second;
		else{
                    System.out.println("It is a NullPointerException Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println("Result is "+ans);
    }
}

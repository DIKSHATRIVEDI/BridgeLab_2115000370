import java.util.Scanner;
public class BasicCalculator{
    public static double addition(double number1,double number2){
	    return number1+number2;
	}
	public static double subtraction(double number1,double number2){
	    return number1-number2;
	}
	public static double multiplication(double number1,double number2){
	    return number1*number2;
	}
	public static double division(double number1,double number2){
	    return number1/number2;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1. additionition\n 2. subtractionion\n 3. Multiplication\n 4. Division");
		System.out.print("Enter choice ");
		int choice=sc.nextInt();
		System.out.print("Enter first number ");
		double number1=sc.nextDouble();
		System.out.print("Enter second number ");
		double number2=sc.nextDouble();
		double answer=0.0;
		switch(choice){
		    case 1:
			    answer=addition(number1,number2);
			    break;
		    case 2:
			    answer=subtraction(number1,number2);
				break;
			case 3:
			    answer=multiplication(number1,number2);
				break;
			case 4:
			    if(number2==0)System.out.println("Error: Division by zero");
				else answer=division(number1,number2);
				break;
			default:
			    System.out.println("Invalid choice");
 		}
		if(choice>=1&&choice<=4&&number2!=0)System.out.println("answer --> "+answer);
	}
}
import java.util.*;
public class QuotientAndReminder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int number1=sc.nextInt();
        System.out.println("Enter Number 2");
        int number2=sc.nextInt();
        int quotient=number1/number2;
        int remainder=number1%number2;
        System.out.println("The quotient is " + quotient + " and Remainder is "+ remainder+ " of the two numbers " + number1 + " and " + number2);
    }
}

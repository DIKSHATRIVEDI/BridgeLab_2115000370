import java.util.Scanner;
public class FindFactorialWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number ");
        int number=sc.nextInt();
        int factorial=1;
        if(number>=0){
            for(int i=1;i<=number;i++)factorial=factorial*i;
            System.out.println("Factorial of "+number+" is: "+factorial);
        }
	else System.out.println("Please enter a positive integer");
    }
}

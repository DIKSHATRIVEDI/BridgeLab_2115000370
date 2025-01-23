import java.util.Scanner;
public class FindFactorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number ");
        int number=sc.nextInt();
        int factorial=1;
        int i=1;
        if(number>=0){
            while(i<=number){
                factorial=factorial*i;
                i++;
            }
            System.out.println("Factorial of "+number+" is: "+factorial);
        }
	else System.out.println("Please enter a positive integer");
	}
}

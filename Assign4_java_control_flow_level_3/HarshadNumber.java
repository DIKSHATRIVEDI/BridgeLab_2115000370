import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        int n=number;
        int sum=0;
        while(number>0){
            int digit=number%10;
            sum+=digit;
            number=number/10;
        }
	if(n%sum==0)System.out.println(n+" is a Harshad Number");
        else System.out.println(n+" is not a Harshad Number");
    }
}

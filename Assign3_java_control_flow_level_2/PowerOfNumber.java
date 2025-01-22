import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        System.out.print("Enter power ");
        int power=sc.nextInt();
        int answer=1;
        for(int i=1;i<=power;i++)answer=answer*number;
		System.out.println(number+" raised to the power of "+power+" is: "+answer);
    }
}

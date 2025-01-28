import java.util.Scanner;
public class MaximumHandshake{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students ");
		int number=sc.nextInt();
		int total=(number*(number-1))/2;
		System.out.println("Maximum number of handshakes "+total);
	}
}
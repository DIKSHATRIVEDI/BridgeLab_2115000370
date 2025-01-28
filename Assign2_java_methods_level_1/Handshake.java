import java.util.Scanner;
public class Handshake{
    public static int calculateHandshakes(int number){
        return (number*(number-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students ");
		int number=sc.nextInt();
		int total=calculateHandshakes(number);
		System.out.println("Maximum number of handshakes "+total);
	}
}
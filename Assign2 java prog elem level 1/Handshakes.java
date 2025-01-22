import java.util.Scanner;
public class Handshakes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Students ");
        int numberOfStudents=sc.nextInt();
        int possibleHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The number of possible Handshakes is "+possibleHandshakes);
    }
}

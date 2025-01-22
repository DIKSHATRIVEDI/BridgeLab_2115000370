import java.util.Scanner;
public class HeightFeetToInches{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter height in cm ");
        double heightInCm=sc.nextDouble();
        double heightInInches=heightInCm/2.54;
        int feet=(int)heightInInches/12;
        int inches=(int)heightInInches%12;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+feet+" and inches is "+inches);
}
}

import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in kg ");
        double weight=sc.nextDouble();
        System.out.print("Enter height in cm ");
        double height=sc.nextDouble();
        height=height/100; 
        double bmi=weight/(height*height);
        System.out.println("BMI is "+bmi);
        if(bmi<18.5)System.out.println("Underweight");
        else if(bmi>=18.5 && bmi<25)System.out.println("Normal");
	else if(bmi>=25 && bmi<40)System.out.println("Overweight");
	else System.out.println("Obese");
    }
}

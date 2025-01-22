import java.util.*;
public class DoubleOpt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        System.out.println("Enter third number");
        double c=sc.nextDouble();
        double res1=a+b*c;
        double res2=a*b+c;
        double res3=c+a/b;
        double res4=a%b+c;
        System.out.println("The result of above operations are "+ res1+","+res2+","+res3+","+res4);
    }
}

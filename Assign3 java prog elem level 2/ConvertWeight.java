import java.util.*;
public class ConvertWeight{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight in pounds ");
        double pound=sc.nextDouble();
        double kg=pound*2.2;
        System.out.println("The weight of the person in pounds is "+pound+" and in kilograms is "+kg);
    }
}

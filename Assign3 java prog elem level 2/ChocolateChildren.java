import java.util.*;
public class ChocolateChildren{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of chocolates ");
        int numberOfChocolates=sc.nextInt();
        System.out.print("Enter the number of children ");
        int numberOfChildren=sc.nextInt();
        int chocoForChild=numberOfChocolates/numberOfChildren;
        int leftChocolates=numberOfChocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+ chocoForChild+" and the number of remaining chocolates are "+leftChocolates+ ".");
    }
}

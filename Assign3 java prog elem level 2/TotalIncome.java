import java.util.*;
class TotalIncome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary ");
        double salary=sc.nextDouble();
        System.out.print("Enter bonus ");
        double bonus=sc.nextDouble();
        double totalIncome=salary+bonus;
        System.out.println("The salary is " + salary + " and bonus is " + bonus +". Hence Total Income is " + totalIncome);
    }
}

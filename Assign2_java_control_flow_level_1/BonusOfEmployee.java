import java.util.Scanner;
public class BonusOfEmployee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter salary ");
	double salary=sc.nextDouble();
	System.out.print("Enter years of service ");
	int serviceYears=sc.nextInt();
	double bonus=0;
	if(serviceYears>5)bonus=salary*0.05;
	System.out.println("Bonus amount "+bonus);
    }
}

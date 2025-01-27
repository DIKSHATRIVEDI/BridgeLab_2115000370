import java.util.Scanner;
public class LeapYearCheck{
    public static void checkLeapYear(int year){
	    if(year>=1582){
		    if(isLeapYear(year))System.out.println("Year is a Leap Year");
			else System.out.println("Year is not a Leap Year");
		}
		else System.out.println("Invalid year");
	}
	public static boolean isLeapYear(int year){
	    return (year%4==0 && year%100!=0) || (year%400==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year ");
		int year=sc.nextInt();
		checkLeapYear(year);
	}
}
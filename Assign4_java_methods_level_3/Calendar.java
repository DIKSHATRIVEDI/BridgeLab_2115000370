import java.util.Scanner;
public class Calendar{ 
    public static String getMonthName(int month){
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		return months[month-1];
	}
    public static int getDaysInMonth(int month,int year){
		int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2&&leapYear(year))return 29;
		return daysInMonths[month-1];
	}
	public static boolean leapYear(int year){
		return (year%4==0&&year%100!=0)||(year%400==0);
	}
	public static int getFirstDayOfWeek(int year,int month){
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(1+x+(31*m0)/12)%7;
		return d0;
	}
	public static void display(String monthName,int daysInMonth,int firstDayOfWeek,int year){
		System.out.println("   "+monthName+" "+year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for(int i=0;i<firstDayOfWeek;i++)System.out.print("    ");
		for(int i=1;i<=daysInMonth;i++){
			System.out.printf("%3d",i);
			if((i+firstDayOfWeek)%7==0)System.out.println();
		}
		System.out.println();
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter month ");
		int month=sc.nextInt();
		System.out.print("Enter year ");
		int year=sc.nextInt();
		String monthName=getMonthName(month);
		int daysInMonth=getDaysInMonth(month,year);
		int firstDayOfWeek=getFirstDayOfWeek(year,month);
		display(monthName,daysInMonth,firstDayOfWeek,year);
	}
}
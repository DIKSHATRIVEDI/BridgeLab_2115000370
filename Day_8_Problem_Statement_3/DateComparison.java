import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison{
	public static void comparison(LocalDate date1,LocalDate date2){
		if(date1.isBefore(date2))System.out.println(date1+" is before "+date2);
		else if(date1.isAfter(date2))System.out.println(date1+" is after "+date2);
		else System.out.println(date1+" is same as "+date2);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first date in this YYYY-MM-dd format ");
		String str1=sc.nextLine();
		LocalDate date1=LocalDate.parse(str1,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.print("Enter the second date in this YYYY-MM-dd format ");
		String str2=sc.nextLine();
		LocalDate date2=LocalDate.parse(str2,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		comparison(date1,date2);
	}
}
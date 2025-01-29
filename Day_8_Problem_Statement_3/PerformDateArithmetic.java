import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PerformDateArithmetic{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter date in this YYYY-MM-dd format ");
		String str=sc.nextLine();
		LocalDate date=LocalDate.parse(str,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate newDate=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		System.out.println("New date --> "+newDate);
	}
}
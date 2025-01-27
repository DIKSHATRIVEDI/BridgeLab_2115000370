import java.util.Scanner;
public class UnitConvertor{
    public static double convertKmToMiles(double km){return km*0.621371;}
	public static double convertMilesToKm(double miles){return miles*1.60934;}
	public static double convertMetersToFeet(double meters){return meters*3.28084;}
	public static double convertFeetToMeters(double feet){return feet*0.3048;}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value ");
		double value=sc.nextDouble();
		System.out.print("Enter choice (1:kmToMiles, 2:milesToKm, 3:metersToFeet, 4:feetToMeters) ");
		int choice=sc.nextInt();
		double result=0;
		switch(choice){
			case 1:result=convertKmToMiles(value);break;
			case 2:result=convertMilesToKm(value);break;
			case 3:result=convertMetersToFeet(value);break;
			case 4:result=convertFeetToMeters(value);break;
			default:System.out.println("Invalid choice");return;
		}
		System.out.println("Result "+result);
	}
}
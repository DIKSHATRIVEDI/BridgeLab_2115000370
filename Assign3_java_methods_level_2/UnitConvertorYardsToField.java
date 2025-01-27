import java.util.Scanner;
public class UnitConvertorYardsToField{
    public static double convertYardsToFeet(double yards){return yards*3;}
	public static double convertFeetToYards(double feet){return feet*0.333333;}
	public static double convertMetersToInches(double meters){return meters*39.3701;}
	public static double convertInchesToMeters(double inches){return inches*0.0254;}
	public static double convertInchesToCentimeters(double inches){return inches*2.54;}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Choose a conversion ");
		System.out.println("1. Yards to Feet");
		System.out.println("2. Feet to Yards");
		System.out.println("3. Meters to Inches");
		System.out.println("4. Inches to Meters");
		System.out.println("5. Inches to Centimeters");
		System.out.print("Enter your choice (1-5) ");
		int choice=sc.nextInt();
		System.out.print("Enter the value ");
		double value=sc.nextDouble();
		double result=0;
		switch(choice){
		    case 1:result=convertYardsToFeet(value);break;
			case 2:result=convertFeetToYards(value);break;
			case 3:result=convertMetersToInches(value);break;
			case 4:result=convertInchesToMeters(value);break;
			case 5:result=convertInchesToCentimeters(value);break;
			default:System.out.println("Invalid choice");return;
		}
		System.out.println("Result: "+result);
	}
}
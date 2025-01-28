import java.util.Scanner;
public class TrigonometricFunctions{
    public static double[] calculateTrigonometricFunctions(double angleInRadians){
	    double[] array=new double[3];
		array[0]=Math.sin(angleInRadians);
		array[1]=Math.cos(angleInRadians);
		array[2]=Math.tan(angleInRadians);
		return array;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter angle in degrees ");
		double angleInDegrees=sc.nextDouble();
		double angleInRadians=Math.toRadians(angleInDegrees);
		double[] array=calculateTrigonometricFunctions(angleInRadians);
		System.out.println("Sine "+array[0]);
		System.out.println("Cosine "+array[1]);
		System.out.println("Tangent "+array[2]);
	}
}
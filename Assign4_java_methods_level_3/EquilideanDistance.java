import java.util.Scanner;
public class EquilideanDistance{
    public static double calculateDistance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] calculateEquation(double x1,double y1,double x2,double y2){
        double slope;
		if(x2-x1==0)slope=Double.POSITIVE_INFINITY;
		else slope=(y2-y1)/(x2-x1);
		double yIntercept=y1-slope*x1;
		return new double[]{slope,yIntercept};
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter x1 ");
		double x1=sc.nextDouble();
		System.out.print("Enter y1 ");
		double y1=sc.nextDouble();
		System.out.print("Enter x2 ");
		double x2=sc.nextDouble();
		System.out.print("Enter y2 ");
		double y2=sc.nextDouble();
		double distance=calculateDistance(x1,y1,x2,y2);
		System.out.println("Euclidean Distance "+distance);
		double[] lineParams=calculateEquation(x1,y1,x2,y2);
		double slope=lineParams[0];
		double yIntercept=lineParams[1];
		System.out.println("Equation of the line y = "+slope+"x + "+yIntercept);
	}

}
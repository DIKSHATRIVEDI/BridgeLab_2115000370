import java.util.Scanner;
public class Collinear{
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
		System.out.print("Enter x3 ");
		double x3=sc.nextDouble();
		System.out.print("Enter y3 ");
		double y3=sc.nextDouble();
		boolean slope=bySlope(x1,y1,x2,y2,x3,y3);
		boolean area=byArea(x1,y1,x2,y2,x3,y3);
		System.out.println("Collinear by slope "+slope);
		System.out.println("Collinear by area "+area);
	}
	public static boolean bySlope(double x1,double y1,double x2,double y2,double x3,double y3){
	    double slopeAB=(y2-y1)/(x2-x1);
		double slopeBC=(y3-y2)/(x3-x2);
		double slopeAC=(y3-y1)/(x3-x1);
		return (slopeAB==slopeBC)&&(slopeBC==slopeAC);
	}
	public static boolean byArea(double x1,double y1,double x2,double y2,double x3,double y3){
	    double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		return Math.abs(area)<1e-9;
	}
}
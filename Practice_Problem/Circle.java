import java.util.Scanner;
public class Circle{
    double radius;
	public Circle(){
	    this(1.0);
	}
	public Circle(double radius){
	    this.radius=radius;
	}
	public void display(){
	    System.out.println("Radius --> "+radius);
	}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle or press Enter for default radius --> ");
		String value=sc.nextLine();
		Circle circle;
		if(value.isEmpty())circle=new Circle();
		else{
		    double radius=Double.parseDouble(value);
			circle=new Circle(radius);
		}
		circle.display();
	}
}
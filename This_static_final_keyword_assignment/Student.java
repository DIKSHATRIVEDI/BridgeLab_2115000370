import java.util.Scanner;
public class Student{
    static String universityName="GLA University";
	static int totalStudents=0;
	final int rollNumber;
	String name;
	char grade;
	public Student(String name,char grade){
        this.name=name;
		this.grade=grade;
		rollNumber=++totalStudents;
	}
	public static int displayTotalStudents(){
        return totalStudents;
	}
	public void display(){
	    if(this instanceof Student){
	        System.out.println("University --> "+universityName);
		    System.out.println("Roll Number --> "+rollNumber);
		    System.out.println("Name --> "+name);
		    System.out.println("Grade --> "+grade);
	    }
	    else System.out.println("Not a valid object");
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name ");
		String name=sc.nextLine();
		System.out.print("Enter Grade ");
		char grade=sc.next().charAt(0);
		Student student=new Student(name,grade);
		student.display();
		System.out.println("Total Students --> "+Student.displayTotalStudents());
    }
}
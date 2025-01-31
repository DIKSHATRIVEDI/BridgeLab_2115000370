import java.util.Scanner;
public class Course{
	String courseName;
	int duration;
	double fee;
	static String instituteName="";
	public Course(String courseName,int duration,double fee){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
	}
	public void displayCourseDetails(){
		System.out.println("Course Name "+courseName);
		System.out.println("Duration "+duration+" weeks");
		System.out.println("Fee $"+fee);
		System.out.println("Institute Name "+instituteName);
	}
	public static void updateInstituteName(String newInstituteName){
		instituteName=newInstituteName;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter course name ");
		String courseName=sc.nextLine();
		System.out.print("Enter course duration ");
		int duration=sc.nextInt();
		System.out.print("Enter course fee ");
		double fee=sc.nextDouble();
		Course course1=new Course(courseName,duration,fee);
		course1.displayCourseDetails();
		System.out.print("Enter new institute name ");
		sc.nextLine(); 
		String newInstituteName=sc.nextLine();
		Course.updateInstituteName(newInstituteName);
		System.out.println("\nCourse 1 Details after Update --> ");
		course1.displayCourseDetails();
	}
}
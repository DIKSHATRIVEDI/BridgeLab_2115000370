import java.util.ArrayList;
import java.util.List;
class Student{
    private String studentId;
	private String name;
	private List<Course> enrolledCourses;
	public Student(String studentId,String name){
        this.studentId=studentId;
		this.name=name;
		this.enrolledCourses=new ArrayList<>();
	}
	public String getName(){
	    return name;
	}
	public void enrollInCourse(Course course){
	    enrolledCourses.add(course);
		course.enrollStudent(this);
	}
	public void viewEnrolledCourses(){
		System.out.println("Student --> "+name+" - Enrolled Courses --> ");
		for(Course course:enrolledCourses)System.out.println(" - "+course.getCourseName());
    }
}
class Course{
	private String courseCode;
	private String courseName;
	private List<Student> enrolledStudents;
	public Course(String courseCode,String courseName){
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.enrolledStudents=new ArrayList<>();
	}
	public String getCourseName(){
		return courseName;
	}
	public void enrollStudent(Student student){
		enrolledStudents.add(student);
	}
	public void showEnrolledStudents(){
		System.out.println("Course --> "+courseName+" - Enrolled Students -->");
		for(Student student:enrolledStudents)System.out.println(" - "+student.getName());
    }
}
class School{
	private String schoolName;
	private List<Student> students;
	public School(String schoolName){
		this.schoolName=schoolName;
		this.students=new ArrayList<>();
	}
	public void addStudent(Student student){
		students.add(student);
	}
	public void displaySchoolInfo(){
		System.out.println("School --> "+schoolName);
		System.out.println("Students --> ");
		for(Student student:students)System.out.println(" - "+student.getName());
    }
}
public class SchoolManagement{
	public static void main(String[] args){
		School school=new School("ABC School");
		Student student1=new Student("S001","John Doe");
		Student student2=new Student("S002","Jane Doe");
		Course course1=new Course("CS101","Computer Science");
		Course course2=new Course("MATH101","Calculus");
		school.addStudent(student1);
		school.addStudent(student2);
		student1.enrollInCourse(course1);
		student1.enrollInCourse(course2);
		student2.enrollInCourse(course1);
		school.displaySchoolInfo();
		student1.viewEnrolledCourses();
		course1.showEnrolledStudents();
    }
}
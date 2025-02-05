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
	public void enrollCourse(Course course){
	    enrolledCourses.add(course);
    }
	public void displayStudentInfo(){
	    System.out.println("Student ID --> "+studentId);
		System.out.println("Name --> "+name);
		System.out.println("Enrolled Courses --> ");
		for(Course course:enrolledCourses)System.out.println(" - "+course.getCourseName());
    }
}
class Course{
    private String courseCode;
	private String courseName;
	private Professor professor;
	private List<Student> enrolledStudents;
	public Course(String courseCode,String courseName){
	    this.courseCode=courseCode;
		this.courseName=courseName;
		this.enrolledStudents=new ArrayList<>();
	}
	public String getCourseName(){
        return courseName;
	}
	public void assignProfessor(Professor professor){
	    this.professor=professor;
	}
	public void enrollStudent(Student student){
        enrolledStudents.add(student);
    }
	public void displayCourseInfo(){
	    System.out.println("Course Code --> "+courseCode);
		System.out.println("Course Name --> "+courseName);
		if(professor!=null)System.out.println("Professor --> "+professor.getName());
    }
}
class Professor{
    private String professorId;
	private String name;
	private List<Course> assignedCourses;
	public Professor(String professorId,String name){
        this.professorId=professorId;
        this.name=name;
		this.assignedCourses=new ArrayList<>();
	}
	public String getName(){
	    return name;
	}
	public void assignCourse(Course course){
        assignedCourses.add(course);
	}
	public void displayProfessorInfo(){
	    System.out.println("Professor ID --> "+professorId);
		System.out.println("Name --> "+name);
		System.out.println("Assigned Courses --> ");
		for(Course course:assignedCourses)System.out.println(" - "+course.getCourseName());
    }
}
public class University{
    public static void main(String[] args){
		Student student1=new Student("S101","Alice Wonderland");
		Student student2=new Student("S102","Bob Marley");
		Student student3=new Student("S103","Charlie Chaplin");
		Professor professor1=new Professor("P001","Dr. Stephen Hawking");
		Professor professor2=new Professor("P002","Dr. Marie Curie");
		Course course1=new Course("CS101","Introduction to Computer Science");
		Course course2=new Course("MATH201","Calculus");
		Course course3=new Course("HIST101","Ancient History");
		course1.assignProfessor(professor1);
		course2.assignProfessor(professor2);
		course3.assignProfessor(professor1);
		student1.enrollCourse(course1);
		student1.enrollCourse(course2);
		student2.enrollCourse(course1);
		student3.enrollCourse(course3);
		student1.displayStudentInfo();
		System.out.println();
		student2.displayStudentInfo();
		System.out.println();
		student3.displayStudentInfo();
		System.out.println();
		professor1.displayProfessorInfo();
		System.out.println();
		professor2.displayProfessorInfo();
		System.out.println();
		course1.displayCourseInfo();
		System.out.println();
		course2.displayCourseInfo();
		System.out.println();
		course3.displayCourseInfo();
	}
}
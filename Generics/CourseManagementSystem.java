import java.util.*;
abstract class CourseType{
    private String name;
    public CourseType(String name){
	    this.name=name;
	}
	public abstract void evaluate();
	public String getName(){
	    return name;
	}
}
class ExamCourse extends CourseType{
    public ExamCourse(String name){
        super(name);
	}
	@Override
	public void evaluate(){
	    System.out.println(getName()+" is evaluated by exam");
	}
}
class AssignmentCourse extends CourseType{
    public AssignmentCourse(String name){
	    super(name);
	}
	@Override
	public void evaluate(){
	    System.out.println(getName()+" is evaluated by assignments");
	}
}
class ResearchCourse extends CourseType{
    public ResearchCourse(String name){
        super(name);
    }
    @Override
    public void evaluate(){
        System.out.println(getName()+" is evaluated by research papers.");
    }
}
class Course<T extends CourseType>{
    private T courseType;
    public Course(T courseType){
        this.courseType=courseType;
    }
    public void evaluateCourse(){
        courseType.evaluate();
    }
    public String getCourseName(){
        return courseType.getName();
    }
}
class CourseManagement{
    public void evaluateAllCourses(List<? extends CourseType> courses){
        for(CourseType course:courses){
		    course.evaluate();
		}
	}
}
public class CourseManagementSystem{
    public static void main(String[] args){
	    Course<ExamCourse> exam=new Course<>(new ExamCourse("Math-101"));
		Course<AssignmentCourse> assign=new Course<>(new AssignmentCourse("English-101"));
		Course<ResearchCourse> res=new Course<>(new ResearchCourse("Physics-101"));
		exam.evaluateCourse();
		assign.evaluateCourse();
		res.evaluateCourse();
		List<CourseType> courses=new ArrayList<>();
		courses.add(new ExamCourse("Math-102"));
		courses.add(new AssignmentCourse("History-101"));
		CourseManagement cm=new CourseManagement();
		cm.evaluateAllCourses(courses);
	}
}
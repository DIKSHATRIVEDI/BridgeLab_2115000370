import java.util.ArrayList;
import java.util.List;
class Faculty{
	private String facultyId;
	private String name;
	public Faculty(String facultyId,String name){
		this.facultyId=facultyId;
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
class Department{
	private String departmentName;
	private List<Faculty> facultyMembers;
	public Department(String departmentName){
		this.departmentName=departmentName;
		this.facultyMembers=new ArrayList<>();
	}
	public String getDepartmentName(){
		return departmentName;
	}
	public void addFaculty(Faculty faculty){
		facultyMembers.add(faculty);
	}
	public void removeFaculty(Faculty faculty){
		facultyMembers.remove(faculty);
	}
}
class University{
	private String universityName;
	private List<Department> departments;
	public University(String universityName){
		this.universityName=universityName;
		this.departments=new ArrayList<>();
	}
	public void addDepartment(Department department){
		departments.add(department);
	}
	public void removeDepartment(Department department){
		departments.remove(department);
	}
	public void displayUniversityInfo(){
		System.out.println("University --> "+universityName);
		System.out.println("Departments --> ");
		for(Department department:departments)System.out.println(" - "+department.getDepartmentName());
    }
}
public class UniversitySystem{
	public static void main(String[] args){
		Faculty faculty1=new Faculty("F001","Dr. Smith");
		Faculty faculty2=new Faculty("F002","Dr. Jones");
		Faculty faculty3=new Faculty("F003","Dr. Davis");
		Department department1=new Department("Computer Science");
		Department department2=new Department("Mathematics");
		department1.addFaculty(faculty1);
		department1.addFaculty(faculty2);
		department2.addFaculty(faculty3);
		University university=new University("GLA University");
		university.addDepartment(department1);
		university.addDepartment(department2);
		university.displayUniversityInfo();
		university.removeDepartment(department1);
		System.out.println("\nUniversity after removing department --> ");
		university.displayUniversityInfo();
    }
}

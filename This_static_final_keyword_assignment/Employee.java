import java.util.Scanner;
public class Employee{
    static String companyName="Capgemeni Corporation";
	static int totalEmployees=0;
	final int id;
	String name;
	String designation;
	public Employee(String name,String designation){
	    this.name=name;
		this.designation=designation;
		id=++totalEmployees;
	}
	public static int displayTotalEmployees(){
	    return totalEmployees;
	}
	public void display(){
	    if(this instanceof Employee){
		    System.out.println("Company Name --> "+companyName);
			System.out.println("Employee ID --> "+id);
			System.out.println("Name --> "+name);
			System.out.println("Designation --> "+designation);
		}
		else System.out.println("Not a valid object");
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name ");
		String name=sc.nextLine();
		System.out.print("Enter Employee Designation ");
		String designation=sc.nextLine();
		Employee employee=new Employee(name,designation);
		employee.display();
		System.out.println("Total Employees --> "+Employee.displayTotalEmployees());
    }
}
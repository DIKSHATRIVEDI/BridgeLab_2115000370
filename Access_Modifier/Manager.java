import java.util.Scanner;
class Employee{
	public int employeeID;
	protected String department;
	private double salary;
	public Employee(int employeeID,String department,double salary){
		this.employeeID=employeeID;
		this.department=department;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void modifySalary(double newSalary){
		setSalary(newSalary);
	}
}
class Manager extends Employee{
	public Manager(int employeeID,String department,double salary){
		super(employeeID,department,salary);
	}
	public void displayManagerInfo(){
		System.out.println("Employee ID --> "+employeeID);
		System.out.println("Department --> "+department);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID ");
		int employeeID=sc.nextInt();
		System.out.print("Enter Department ");
		sc.nextLine(); 
		String department=sc.nextLine();
		System.out.print("Enter Salary ");
		double salary=sc.nextDouble();
		Manager manager=new Manager(employeeID,department,salary);
		manager.displayManagerInfo();
		System.out.println("Initial Salary "+manager.getSalary()); 
		manager.modifySalary(70000.0);
		System.out.println("Modified Salary "+manager.getSalary()); 
    }
}

import java.util.ArrayList;
import java.util.List;
interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}
abstract class Employee implements Department{
    private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	public Employee(int employeeId,String name,double baseSalary){
	    this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	public int getEmployeeId(){
	    return employeeId;
	}
	public String getName(){
	    return name;
	}
	public double getBaseSalary(){
	    return baseSalary;
	}
	public void setBaseSalary(double baseSalary){
	    this.baseSalary=baseSalary;
	}
	public abstract double calculateSalary();
	public void displayDetails(){
        System.out.println("ID --> "+employeeId+", Name --> "+name+", Salary --> $"+calculateSalary()+", Department --> "+department);
    }
    @Override
    public void assignDepartment(String department){
        this.department=department;
    }
	@Override
	public String getDepartmentDetails(){
	    return "Department --> "+department;
	}
}
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(int employeeId,String name,double baseSalary,double monthlySalary){
        super(employeeId,name,baseSalary);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee(int employeeId,String name,double baseSalary,int hoursWorked,double hourlyRate){
	    super(employeeId,name,baseSalary);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double calculateSalary(){
	    return hoursWorked*hourlyRate;
	}
}
public class EmployeeManagementSystem{
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
		employees.add(new FullTimeEmployee(1,"Kiya",5000,6000));
		employees.add(new PartTimeEmployee(2,"Biya",2000,100,30));
		employees.add(new FullTimeEmployee(3,"Ciya",7000,8000));
		for(Employee employee:employees){
		    employee.assignDepartment("Technology");
			employee.displayDetails();
			System.out.println(employee.getDepartmentDetails());
			System.out.println();
		}
	}
}
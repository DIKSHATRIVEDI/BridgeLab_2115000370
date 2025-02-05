import java.util.ArrayList;
import java.util.List;
class Employee{
    private String employeeId;
	private String name;
	public Employee(String employeeId,String name){
	    this.employeeId=employeeId;
		this.name=name;
	}
	public String getName(){
	    return name;
	}
}
class Department{
    private String departmentName;
	private List<Employee> employees;
	public Department(String departmentName){
	    this.departmentName=departmentName;
		this.employees=new ArrayList<>();
	}
	public String getDepartmentName(){
	    return departmentName;
	}
	public void addEmployee(Employee employee){
	    employees.add(employee);
	}
	public List<Employee> getEmployees(){ 
        return employees; 
    }
}
class Company{
    private String companyName;
	private List<Department> departments;
	public Company(String companyName){
        this.companyName=companyName;
		this.departments=new ArrayList<>();
	}
	public void addDepartment(Department department){
	    departments.add(department);
	}
	public void displayCompanyInfo(){
	    System.out.println("Company --> "+companyName);
		for(Department department:departments){
			System.out.println(" - "+department.getDepartmentName());
		    for(Employee employee:department.getEmployees())System.out.println(" - "+employee.getName());
		}
    }
}
public class CompanyStructure{
    public static void main(String[] args){
        Employee employee1=new Employee("E001","John Doe");
		Employee employee2=new Employee("E002","Jane Doe");
		Employee employee3=new Employee("E003","David Lee");
		Department department1=new Department("IT");
		Department department2=new Department("HR");
		department1.addEmployee(employee1);
		department1.addEmployee(employee2);
		department2.addEmployee(employee3);
		Company company=new Company("Capgemeini Corp");
		company.addDepartment(department1);
		company.addDepartment(department2);
		company.displayCompanyInfo();
	}
}
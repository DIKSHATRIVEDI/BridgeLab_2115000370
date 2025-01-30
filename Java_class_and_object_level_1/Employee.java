import java.util.Scanner;
public class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
	public void display(){
	    System.out.println("Name --> "+name);
		System.out.println("ID --> "+id);
		System.out.println("Salary --> "+salary);
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name ");
		String name=sc.nextLine();
		System.out.print("Enter employee ID ");
		int id=sc.nextInt();
		System.out.print("Enter employee salary ");
		double salary=sc.nextDouble();
		Employee emp=new Employee(name,id,salary);
		emp.display();
	}
}
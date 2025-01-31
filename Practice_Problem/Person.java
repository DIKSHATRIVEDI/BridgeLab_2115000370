import java.util.Scanner;
public class Person{
    String name;
	int age;
	public Person(String name,int age){
        this.name=name;
		this.age=age;
	}
	public Person(Person other){
        this.name=other.name;
		this.age=other.age;
	}
	public void display(){
	    System.out.println("Name --> "+name);
		System.out.println("Age --> "+age);
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter name ");
		String name=sc.nextLine();
	    System.out.print("Enter age ");
		int age=sc.nextInt();
		Person person1=new Person(name,age);
		Person person2=new Person(person1); 
		person1.display();
		System.out.println("Copied Person ");
		person2.display();
	}
}
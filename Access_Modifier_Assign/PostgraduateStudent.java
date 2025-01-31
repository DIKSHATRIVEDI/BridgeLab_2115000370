import java.util.Scanner;
class Student{
    public int rollNumber;
	protected String name;
	private double CGPA;
	public Student(int rollNumber,String name,double CGPA){
	    this.rollNumber=rollNumber;
		this.name=name;
		this.CGPA=CGPA;
	}
	public double getCGPA(){
	    return CGPA;
	}
	public void setCGPA(double CGPA){
	    this.CGPA=CGPA;
	}
}
class PostgraduateStudent extends Student{
    public PostgraduateStudent(int rollNumber,String name,double CGPA){
        super(rollNumber,name,CGPA);
    }
    public void display(){
        System.out.println("Roll Number --> "+rollNumber);
        System.out.println("Name --> "+name); 
    }
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll Number ");
		int rollNumber=sc.nextInt();
		System.out.print("Enter Name ");
		sc.nextLine(); 
		String name=sc.nextLine();
		System.out.print("Enter CGPA ");
		double CGPA=sc.nextDouble();
		PostgraduateStudent pgStudent=new PostgraduateStudent(rollNumber,name,CGPA);
		pgStudent.display();
		System.out.println("CGPA --> "+pgStudent.getCGPA()); 
    }
}

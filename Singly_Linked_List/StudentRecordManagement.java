class Student{
	int rollNumber;
	String name;
	int age;
	char grade;
	Student next;
	public Student(int rollNumber,String name,int age,char grade){
		this.rollNumber=rollNumber;
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.next=null;
	}
}
public class StudentRecordManagement{
	Student head;
	public StudentRecordManagement(){
		head=null;
	}
	public void addAtBeginning(int rollNumber,String name,int age,char grade){
		Student newStudent=new Student(rollNumber,name,age,grade);
		newStudent.next=head;
		head=newStudent;
	}
	public void addAtEnd(int rollNumber,String name,int age,char grade){
		Student newStudent=new Student(rollNumber,name,age,grade);
		if(head==null){
			head=newStudent;
			return;
		}
		Student current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newStudent;
	}
	public void addAtPosition(int position,int rollNumber,String name,int age,char grade){
		if(position<=0){
			System.out.println("Invalid position");
			return;
		}
		if(position==1){
			addAtBeginning(rollNumber,name,age,grade);
			return;
		}
		Student newStudent=new Student(rollNumber,name,age,grade);
		Student current=head;
		int count=1;
		while(current!=null&&count<position-1){
			current=current.next;
			count++;
		}
		if(current==null){
			System.out.println("Position out of bounds");
			return;
		}
		newStudent.next=current.next;
		current.next=newStudent;
	}
	public void deleteByRollNumber(int rollNumber){
		if(head==null)return;
		if(head.rollNumber==rollNumber){
			head=head.next;
			return;
		}
		Student current=head;
		while(current.next!=null&&current.next.rollNumber!=rollNumber){
			current=current.next;
		}
		if(current.next==null)return;
		current.next=current.next.next;
	}
	public Student searchByRollNumber(int rollNumber){
		Student current=head;
		while(current!=null){
			if(current.rollNumber==rollNumber)return current;
			current=current.next;
		}
		return null;
	}
	public void displayAll(){
		Student current=head;
		while(current!=null){
			System.out.println("Roll No --> "+current.rollNumber+", Name --> "+current.name+", Age --> "+current.age+", Grade --> "+current.grade);
			current=current.next;
		}
	}
	public void updateGrade(int rollNumber,char newGrade){
		Student student=searchByRollNumber(rollNumber);
		if(student!=null)student.grade=newGrade;
	}
    public static void main(String[] args){
		StudentRecordManagement list=new StudentRecordManagement();
		list.addAtEnd(1,"Riya",20,'A');
		list.addAtEnd(2,"Liya",25,'B');
		list.addAtBeginning(3,"Jiya",16,'C');
		list.addAtPosition(2,4,"Siya",22,'A');
		list.displayAll();
		list.deleteByRollNumber(2);
		System.out.println("\nAfter deleting 2 -->");
		list.displayAll();
		Student student=list.searchByRollNumber(1);
		if(student!=null){
			System.out.println("\nFound student --> ");
			System.out.println("Roll No --> "+student.rollNumber+", Name --> "+student.name+", Age --> "+student.age+", Grade --> "+student.grade);
		}
		list.updateGrade(101,'A');
		System.out.println("\nAfter updating grade of 101 -->");
		list.displayAll();
	}
}
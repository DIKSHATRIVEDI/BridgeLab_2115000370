import java.util.Scanner;
public class Patient{
    static String hospitalName="Fatima Hospital";
    static int totalPatients=0;
	final int patientID;
	String name;
	int age;
	String ailment;
	public Patient(String name,int age,String ailment){
        this.name=name;
		this.age=age;
		this.ailment=ailment;
		patientID=++totalPatients;
	}
	public static int getTotalPatients(){
	    return totalPatients;
	}
	public void display(){
        if(this instanceof Patient){
		    System.out.println("Patient ID --> "+patientID);
		    System.out.println("Name --> "+name);
		    System.out.println("Age --> "+age);
		    System.out.println("Ailment --> "+ailment);
			System.out.println("Hospital --> "+hospitalName);
		}
		else System.out.println("Not a valid Patient object");
	}
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Patient Name ");
		String name=sc.nextLine();
		System.out.print("Enter Patient Age ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Patient Ailment ");
		String ailment=sc.nextLine();
		Patient patient=new Patient(name,age,ailment);
		patient.display();
		System.out.println("Total Patients Admitted --> "+Patient.getTotalPatients());
    }
}
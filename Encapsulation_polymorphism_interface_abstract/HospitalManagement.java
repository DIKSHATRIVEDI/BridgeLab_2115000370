import java.util.ArrayList;
import java.util.List;
interface MedicalRecord{
	void addRecord(String record);
	List<String> viewRecords();
}
abstract class Patient implements MedicalRecord{
	private int patientId;
	private String name;
	private int age;
	private List<String> medicalRecords;
	public Patient(int patientId,String name,int age){
		this.patientId=patientId;
		this.name=name;
		this.age=age;
		this.medicalRecords=new ArrayList<>();
	}
	public int getPatientId(){
		return patientId;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public abstract double calculateBill();
	public String getPatientDetails(){
		return "ID: "+patientId+", Name --> "+name+", Age --> "+age;
	}
	@Override
	public void addRecord(String record){
		medicalRecords.add(record);
	}
	@Override
	public List<String> viewRecords(){
		return medicalRecords;
	}
}
class InPatient extends Patient{
	private int daysAdmitted;
	private double roomChargePerDay;
	public InPatient(int patientId,String name,int age,int daysAdmitted,double roomChargePerDay){
		super(patientId,name,age);
		this.daysAdmitted=daysAdmitted;
		this.roomChargePerDay=roomChargePerDay;
	}
	@Override
	public double calculateBill(){
		return daysAdmitted*roomChargePerDay;
	}
	public int getDaysAdmitted(){
		return daysAdmitted;
	}
	public double getRoomChargePerDay(){
		return roomChargePerDay;
	}
}
class OutPatient extends Patient{
	private double consultationFee;
	public OutPatient(int patientId,String name,int age,double consultationFee){
		super(patientId,name,age);
		this.consultationFee=consultationFee;
	}
	@Override
	public double calculateBill(){
		return consultationFee;
	}
	public double getConsultationFee(){
		return consultationFee;
	}
}
public class HospitalManagement{
	public static void main(String[] args){
		List<Patient> patients=new ArrayList<>();
		patients.add(new InPatient(101,"Kiya",45,5,580));
		patients.add(new OutPatient(102,"Jiya",30,270));
		patients.add(new InPatient(103,"Diya",60,3,750));
		for(Patient patient:patients){
			System.out.println(patient.getPatientDetails());
			System.out.println("Bill --> $"+patient.calculateBill());
			patient.addRecord("Initial assessment --> Stable");
			patient.addRecord("Medication prescribed");
			System.out.println("Medical Records --> ");
			for(String record:patient.viewRecords())System.out.println("- "+record);
			System.out.println();
		}
	}
}
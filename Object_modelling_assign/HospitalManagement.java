import java.util.ArrayList;
import java.util.List;
class Doctor{
    private String doctorId;
	private String name;
	private String specialization;
	private List<Patient> patients;
	public Doctor(String doctorId,String name,String specialization){
        this.doctorId=doctorId;
		this.name=name;
		this.specialization=specialization;
		this.patients=new ArrayList<>();
    }
	public String getName(){
        return name;
    }
	public String getSpecialization(){
        return specialization;
    }
	public void addPatient(Patient patient){
        patients.add(patient);
    }
	public void consult(Patient patient){
	    System.out.println(doctorId+" "+name+" ("+specialization+") is consulting with "+patient.getName());
	}
}
class Patient{
    private String patientId;
	private String name;
	private String address;
	private String phone;
	private List<Doctor> doctors;
	public Patient(String patientId,String name,String address,String phone){
        this.patientId=patientId;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.doctors=new ArrayList<>();
	}
	public String getName(){
	    return name;
	}
	public String getAddress(){
	    return address;
	}
	public String getPhone(){
	    return phone;
	}
	public void addDoctor(Doctor doctor){
        doctors.add(doctor);
	}
}
class Hospital{
    private List<Doctor> doctors;
	private List<Patient> patients;
	public Hospital(){
        this.doctors=new ArrayList<>();
		this.patients=new ArrayList<>();
	}
	public void addDoctor(Doctor doctor){
	    doctors.add(doctor);
	}
	public void addPatient(Patient patient){
        patients.add(patient);
	}
	public void scheduleConsultation(Doctor doctor,Patient patient){
	    doctor.addPatient(patient);
		patient.addDoctor(doctor);
		doctor.consult(patient);
	}
}
public class HospitalManagement{
    public static void main(String[] args){
	    Hospital hospital=new Hospital();
	    Doctor doctor1=new Doctor("D001","Dr. Smith","Cardiologist");
	    Doctor doctor2=new Doctor("D002","Dr. Jones","Pediatrician");
	    Doctor doctor3=new Doctor("D003","Dr. Davis","Dermatologist");
	    Patient patient1=new Patient("P001","John Doe","123 Main St","555-1234");
	    Patient patient2=new Patient("P002","Jane Doe","456 Oak Ave","555-5678");
	    Patient patient3=new Patient("P003","David Lee","789 Elm St","555-9012");
		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor2);
		hospital.addDoctor(doctor3);
		hospital.addPatient(patient1);
		hospital.addPatient(patient2);
		hospital.addPatient(patient3);
		hospital.scheduleConsultation(doctor1,patient1);
		hospital.scheduleConsultation(doctor2,patient2);
		hospital.scheduleConsultation(doctor3,patient3);
		hospital.scheduleConsultation(doctor1,patient3);
	}
}
import java.util.*;
abstract class JobRole{
    public abstract String getRoleName();
}
class SoftwareEngineer extends JobRole{
    public String getRoleName(){
	    return "Software Engineer";
	}
}
class DataScientist extends JobRole{
    public String getRoleName(){
	    return "Data Scientist";
	}
}
class ProductManager extends JobRole{
    public String getRoleName(){
	    return "Product Manager";
	}
}
class Resume<T extends JobRole>{
    private String candidateName;
    private T jobRole;
	public Resume(String candidateName,T jobRole){
	    this.candidateName=candidateName;
		this.jobRole=jobRole;
	}
	public String getCandidateName(){
	    return candidateName;
	}
	public T getJobRole(){
	    return jobRole;
	}
}
class ScreeningPipeline{
    public static void processResumes(List<? extends JobRole> jobRoles){
		System.out.println("Screening resumes for --> ");
		for(JobRole role:jobRoles){
		    System.out.println("- "+role.getRoleName());
		}
	}
}
public class ResumeScreeningSystem{
    public static void main(String[] args){
	    Resume<SoftwareEngineer> se=new Resume<>("Riya",new SoftwareEngineer());
		Resume<DataScientist> ds=new Resume<>("Jiya",new DataScientist());
		Resume<ProductManager> pm=new Resume<>("Siya",new ProductManager());
		List<JobRole> jobRoles=Arrays.asList(se.getJobRole(),ds.getJobRole(),pm.getJobRole());
		ScreeningPipeline.processResumes(jobRoles);
	}
}
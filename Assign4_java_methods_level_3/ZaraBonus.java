import java.util.Random;
public class ZaraBonus{
    public static void main(String[] args){
        int numEmployees=10;
        double[][] employeeData=findSalaryAndYearsOfService(numEmployees);
		double[][] updatedData=findNewSalaryAndBonus(employeeData);
		display(employeeData,updatedData);
	}
	public static double[][] findSalaryAndYearsOfService(int numEmployees){
		Random rand=new Random();
		double[][] data=new double[numEmployees][3];
		for(int i=0;i<numEmployees;i++){
			data[i][0]=rand.nextInt(90000)+10000;
			data[i][1]=rand.nextInt(10)+1;
		}
		return data;
	}
	public static double[][] findNewSalaryAndBonus(double[][] employeeData){
		double[][] updatedData=new double[employeeData.length][3];
		for(int i=0;i<employeeData.length;i++){
			double salary=employeeData[i][0];
			double yearsOfService=employeeData[i][1];
			double bonusPercentage=(yearsOfService>5)?0.05:0.02;
			double bonusAmount=salary*bonusPercentage;
			double newSalary=salary+bonusAmount;
			updatedData[i][0]=newSalary;
			updatedData[i][1]=bonusAmount;
		    updatedData[i][2]=yearsOfService;
	    }
	    return updatedData;
	}
	public static void display(double[][] employeeData,double[][] updatedData){
		System.out.println("Employee Old Salary Years Bonus New Salary");
		double[] totals={0,0,0};
		for(int i=0;i<employeeData.length;i++){
			System.out.println("Employee "+(i+1)+" "+String.format("%.2f",employeeData[i][0])+" "+(int)employeeData[i][2]+"  "+String.format("%.2f",updatedData[i][1])+"  "+String.format("%.2f",updatedData[i][0]));
			totals[0]+=employeeData[i][0];
			totals[1]+=updatedData[i][0];
			totals[2]+=updatedData[i][1];
		}
	    System.out.println("Total"+String.format("%.2f",totals[0])+"    "+String.format("%.2f",totals[1])+"  "+String.format("%.2f",totals[2]));
	}
}
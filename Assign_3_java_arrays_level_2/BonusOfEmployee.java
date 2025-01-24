import java.util.Scanner;
public class BonusOfEmployee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		double[][] data=new double[10][3]; 
		double[] newSalary=new double[10];
		double totalBonus=0;
		double totalOldSalary=0;
		double totalNewSalary=0;
		for(int i=0;i<10;i++){
		    System.out.println("Enter details "+(i+1)+" ");
			double salary=-1;
			while(salary<0){
			    System.out.print("Enter salary ");
				salary=sc.nextDouble();
			}
			data[i][0]=salary;
			totalOldSalary+=salary;
			double yearsOfService=-1;
			while(yearsOfService<0){
			    System.out.print("Enter years of service ");
				yearsOfService=sc.nextDouble();
			}
			data[i][1]=yearsOfService;
			if(yearsOfService>5)data[i][2]=salary*0.05;
			else data[i][2]=salary*0.02;
			totalBonus+=data[i][2];
			newSalary[i]=salary+data[i][2];
			totalNewSalary+=newSalary[i];
		}
		System.out.println("Total Bonus "+totalBonus);
		System.out.println("Total Old Salary "+totalOldSalary);
		System.out.println("Total New Salary "+totalNewSalary);
    }
}
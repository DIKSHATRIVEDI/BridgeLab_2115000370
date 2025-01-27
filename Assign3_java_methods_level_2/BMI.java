import java.util.Scanner;
public class BMI{
    public static void calculateBMI(double[][]data){
	    for(int i=0;i<data.length;i++){
		    data[i][1]/=100;
			data[i][2]=data[i][0]/(data[i][1]*data[i][1]);
		}
	}
	public static String[] findBMIStaus(double[][]data){
	    String[] array=new String[data.length];
		for(int i=0;i<data.length;i++){
		    double bmi=data[i][2];
			if(bmi<18.5)array[i]="Underweight";
			else if(bmi>=18.5&&bmi<25)array[i]="Normal";
			else if(bmi>=25&&bmi<40)array[i]="Overweight";
			else array[i]="Obese";
		}
		return array;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		double[][]data=new double[10][3];
		System.out.println("Enter weight (kg) and height (cm) for 10 people ");
		for(int i=0;i<10;i++){
		    System.out.print("Person "+(i+1)+" ");
			data[i][0]=sc.nextDouble();
			data[i][1]=sc.nextDouble();
		}
		calculateBMI(data);
		String[] bmiarray=findBMIStaus(data);
		System.out.println("\nBMI Results");
		for(int i=0;i<10;i++){
		    System.out.println("Person "+(i+1)+" Weight = "+data[i][0]+" kg, Height = "+data[i][1]+" cm, BMI = "+data[i][2]+", Status = "+bmiarray[i]);
		}
    }
}
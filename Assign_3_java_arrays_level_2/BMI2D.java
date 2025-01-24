import java.util.Scanner;
public class BMI2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of persons ");
		int number=sc.nextInt();
		double[][]personData=new double[number][3];
		String[] weightStatus=new String[number];
		for(int i=0;i<number;i++){
		    System.out.println("Enter details for person "+(i+1)+" ");
		    double height=-1;
		    while(height<=0){
                System.out.print("Enter height in cm ");
			    height=sc.nextDouble();
		    }
		    personData[i][0]=height/100;
		    double weight=-1;
		    while(weight<=0){
		        System.out.print("Enter weight in kg ");
			    weight=sc.nextDouble();
		    }
		    personData[i][1]=weight;
		    personData[i][2]=weight/(personData[i][0]*personData[i][0]);
		    if(personData[i][2]<18.5)weightStatus[i]="Underweight";
			else if(personData[i][2]>=18.5&&personData[i][2]<25)weightStatus[i]="Normal";
			else if(personData[i][2]>=25&&personData[i][2]<40)weightStatus[i]="Overweight";
			else weightStatus[i]="Obese";
        }
		for(int i=0;i<number;i++){
		    System.out.println("Person "+(i+1)+":");
			System.out.println("Height "+personData[i][0]+" m");
			System.out.println("Weight "+personData[i][1]+" kg");
			System.out.println("BMI "+personData[i][2]);
			System.out.println("Weight Status "+weightStatus[i]);
		}
    }
}
import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of persons ");
		int number=sc.nextInt();
		double[] weight=new double[number];
		double[] height=new double[number];
		double[] bmi=new double[number];
		String[] status=new String[number];
		for(int i=0;i<number;i++){
            System.out.println("Enter details  "+(i+1)+" ");
            System.out.print("Enter weight in kg ");
            weight[i]=sc.nextDouble();
            System.out.print("Enter height in cm ");
            height[i]=sc.nextDouble();
			height[i]/=100;
			bmi[i]=weight[i]/(height[i]*height[i]);
			if(bmi[i]<18.5)status[i]="Underweight";
			else if(bmi[i]>=18.5&&bmi[i]<25)status[i]="Normal";
			else if(bmi[i]>=25&&bmi[i]<40)status[i]="Overweight";
			else status[i]="Obese";
		}
		for(int i=0;i<number;i++){
		    System.out.println("Person "+(i+1)+":");
			System.out.println("Height "+height[i]+" m");
			System.out.println("Weight "+weight[i]+" kg");
			System.out.println("BMI "+bmi[i]);
			System.out.println("Weight Status "+status[i]);
		}
	}
}
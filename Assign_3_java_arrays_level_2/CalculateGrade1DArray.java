import java.util.Scanner;
public class CalculateGrade1DArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students ");
		int number=sc.nextInt();
		int[] physicsMarks=new int[number];
		int[] chemistryMarks=new int[number];
		int[] mathsMarks=new int[number];
		double[] percentages=new double[number];
		String[] remarks=new String[number];
		String[] grades=new String[number];
		for(int i=0;i<number;i++){
		    System.out.println("Enter marks for student "+(i+1)+" ");
		    int physics=-1;
			while(physics<0){
			    System.out.print("Physics ");
				physics=sc.nextInt();
			}
			physicsMarks[i]=physics;
			int chemistry=-1;
			while(chemistry<0){
			    System.out.print("Chemistry ");
				chemistry=sc.nextInt();
			}
			chemistryMarks[i]=chemistry;
			int maths=-1;
			while(maths<0){
			    System.out.print("Maths ");
				maths=sc.nextInt();
			}
			mathsMarks[i]=maths;
			double averageMarks=(double)(physics+chemistry+maths)/3;
			percentages[i]=averageMarks;
			if(averageMarks>=80){
			    grades[i]="A";
				remarks[i]="Level 4, above agency-normalized standards";
			}
			else if(averageMarks>=70 && averageMarks<80){
			    grades[i]="B";
				remarks[i]="Level 3, at agency-normalized standards";
			}
			else if(averageMarks>=60 && averageMarks<70){
			    grades[i]="C";
				remarks[i]="Level 2, below, but approaching agency-normalized standards";
			}
			else if(averageMarks>=50 && averageMarks<60){
			    grades[i]="D";
				remarks[i]="Level 1, well below agency-normalized standards";
			}
			else if(averageMarks>=40&&averageMarks<50){
			    grades[i]="E";
				remarks[i]="Level 1-, too below agency-normalized standards";
			}
			else{
			    grades[i]="R";
				remarks[i]="Remedial standards";
			}
		}
		for(int i=0;i<number;i++){
		    System.out.println(" Student "+(i+1)+" ");
			System.out.println(" Percentage "+percentages[i]);
			System.out.println(" Grade "+grades[i]);
			System.out.println(" Remarks "+remarks[i]);
		}
	}
}
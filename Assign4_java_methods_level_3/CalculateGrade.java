import java.util.Scanner;
public class CalculateGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students ");
		int number=sc.nextInt();
		int[][] score=scorePCM(number);
		double[][] array=result(score);
		display(array);
	}
	public static int[][] scorePCM(int number){
	    int[][] score=new int[number][3];
		for(int i=0;i<number;i++){
		    for(int j=0;j<3;j++)score[i][j]=(int)(Math.random()*100);
		}
		return score;
	}
	public static double[][] result(int[][] score){
	    int number=score.length;
		double[][] array=new double[number][6];
		for(int i=0;i<number;i++){
		    int total=0;
			for(int j=0;j<3;j++)total+=score[i][j];
			double average=Math.round((double)total/3*100)/100.0;
			double percentage=Math.round(average*100)/100.0;
			array[i][0]=score[i][0];
			array[i][1]=score[i][1];
			array[i][2]=score[i][2];
			array[i][3]=total;
			array[i][4]=average;
			array[i][5]=percentage;
		}
		return array;
	}
	public static void display(double[][] array){
	    System.out.println("\tStudent\t\tPhysics\t\tChemistry\tMaths\t\tTotal\t\tAverage\t\tPercentage");
		for(int i=0;i<array.length;i++)System.out.println("\t"+(i+1)+"\t\t"+(int)array[i][0]+"\t\t"+(int)array[i][1]+"\t\t"+(int)array[i][2]+"\t\t"+(int)array[i][3]+"\t\t"+array[i][4]+"\t\t"+array[i][5]);
    }
}
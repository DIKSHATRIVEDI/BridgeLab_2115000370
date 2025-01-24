import java.util.Scanner;
public class MeanHeightOfFootballTeam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		double[] heights=new double[11];
		double sum=0;
		for(int i=0;i<11;i++){
		    System.out.print("Enter height of Player "+(i+1)+" in meters ");
			heights[i]=sc.nextDouble();
			sum+=heights[i];
		}
		double meanHeight=sum/11;
		System.out.println("Mean height "+meanHeight+" meters");
    }
}
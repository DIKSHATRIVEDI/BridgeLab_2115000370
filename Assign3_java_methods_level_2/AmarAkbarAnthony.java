import java.util.Scanner;
public class AmarAkbarAnthony{
    public static int calculateYoungest(int[] ages){
	    int youngestPosition=0;
		for(int i=1;i<ages.length;i++){
		    if(ages[i]<ages[youngestPosition])youngestPosition=i;
		}
		return youngestPosition;
	}
	public static int calculateTallest(double[] heights){
	    int tallestPosition=0;
		for(int i=1;i<heights.length;i++){
		    if(heights[i]>heights[tallestPosition])tallestPosition=i;
		}
		return tallestPosition;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] ages=new int[3];
		double[] heights=new double[3];
		for(int i=0;i<3;i++){
		    System.out.print("Enter age of friend "+(i+1)+" ");
			ages[i]=sc.nextInt();
			System.out.print("Enter height of friend "+(i+1)+" in meters ");
			heights[i]=sc.nextDouble();
		}
		int youngestPosition=calculateYoungest(ages);
		int tallestPosition=calculateTallest(heights);
		System.out.println("Youngest friend is friend "+(youngestPosition+1));
		System.out.println("Tallest friend is friend "+(tallestPosition+1));
	}
}
import java.util.Scanner;
public class MaximumOfThreeNumber{
    public static int findMaximum(int[] array){
	    int max=array[0];
		for(int i=1;i<array.length;i++){
		    if(array[i]>max)max=array[i];
		}
		return max;
	}
	public static void display(int max){
	    System.out.println("The maximum number "+max);
	}
    public static int[] arrayInput(){
	    Scanner scanner=new Scanner(System.in);
		int[] array=new int[3];
		System.out.print("Enter first number ");
		array[0]=scanner.nextInt();
		System.out.print("Enter second number ");
		array[1]=scanner.nextInt();
		System.out.print("Enter third number ");
		array[2]=scanner.nextInt();
		return array;
	}
    public static void main(String[] args){
        int[] array=arrayInput();
		int max=findMaximum(array);
		display(max);
	}
}
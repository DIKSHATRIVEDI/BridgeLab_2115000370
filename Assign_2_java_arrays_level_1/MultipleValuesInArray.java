import java.util.Scanner;
public class MultipleValuesInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		double[] array=new double[10];
		double totalValue=0.0;
		int index=0;
		while(true){
		    System.out.print("Enter a number (enter 0 or negative to stop) ");
			double number=sc.nextDouble();
			if(number<=0)break;
			if(index==10){
			    System.out.println("Array is full ");
				break;
			}
		    array[index++]=number;
		}
		for(int i=0;i<index;i++)totalValue+=array[i];
		System.out.print("Entered array ");
		for(int i=0;i<index;i++)System.out.print(array[i]+" ");
		System.out.println("\ntotal "+totalValue);
    }
}
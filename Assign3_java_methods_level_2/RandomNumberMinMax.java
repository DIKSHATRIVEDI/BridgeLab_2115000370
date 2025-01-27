import java.util.Random;
public class RandomNumberMinMax{
    public static int[] generate4DigitranArr(int size){
	    int[] array=new int[size];
		Random rand=new Random();
		for(int i=0;i<size;i++)array[i]=rand.nextInt(9000)+1000;
		return array;
	}
	public static double[] findAverageMinMax(int[] array){
	    double sum=0;
		int min=array[0];
		int max=array[0];
		for(int num:array){
		    sum+=num;
			min=Math.min(min,num);
			max=Math.max(max,num);
		}
		double average=sum/array.length;
		return new double[]{average,min,max};
	}
    public static void main(String[] args){
	    int[] ranArr=generate4DigitranArr(5);
		double[] arr=findAverageMinMax(ranArr);
		System.out.println("Average "+arr[0]);
		System.out.println("Minimum "+arr[1]);
		System.out.println("Maximum "+arr[2]);
	}

}
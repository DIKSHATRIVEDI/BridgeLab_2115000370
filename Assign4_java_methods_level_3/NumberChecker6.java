import java.util.ArrayList;
import java.util.List;
public class NumberChecker6{
    public static int[] findarray(int number){
        List<Integer> list=new ArrayList<>();
		for(int i=1;i<=number/2;i++){
		    if(number%i==0)list.add(i);
		}
		int[] array=new int[list.size()];
		for(int i=0;i<list.size();i++)array[i]=list.get(i);
		return array;
	}
	public static int greatestf(int[] array){
	    int greatest=0;
		for(int f:array)greatest=Math.max(greatest,f);
		return greatest;
	}
	public static int sumArray(int[] array){
	    int sum=0;
		for(int f:array)sum+=f;
		return sum;
	}
	public static int productArray(int[] array){ 
	    int product=1;
		for(int f:array)product*=f;
		return product;
	}
	public static int cube(int[] array){
	    int product=1;
		for(int f:array)product*=(int)Math.pow(f,3);
		return product;
	}
	public static boolean isPerfectNumber(int number,int sumArray){
	    return number==sumArray;
	}
	public static boolean isAbundantNumber(int number,int sumArray){
	    return number<sumArray;
	}
	public static boolean isDeficientNumber(int number,int sumArray){
	    return number>sumArray;
	}
	public static boolean isStrongNumber(int number){
	    int temp=number;
		int sum=0;
		while(temp>0){
		    int digit=temp%10;
			sum+=fial(digit);
			temp/=10;
		}
		return sum==number;
	}
	public static int fial(int n){
	    if(n==0)return 1;
		return n*fial(n-1);
	}
	public static void main(String[] args){
	    int number=6;
		int[] array=findarray(number);
		int greatestf=greatestf(array);
		int sumArray=sumArray(array);
		int productArray=productArray(array);
		int cube=cube(array);
		System.out.println("Factor ");
		for(int f:array)System.out.print(f+" ");
		System.out.println();
		System.out.println("Greatest Factor "+greatestf);
		System.out.println("Sum of array "+sumArray);
		System.out.println("Product of array "+productArray);
		System.out.println("Product of Cube of array "+cube);
		System.out.println("Is Perfect "+isPerfectNumber(number,sumArray));
		System.out.println("Is Abundant "+isAbundantNumber(number,sumArray));
		System.out.println("Is Deficient "+isDeficientNumber(number,sumArray));
		System.out.println("Is Strong "+isStrongNumber(number));
    }
}
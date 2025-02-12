import java.util.*;
public class PairSum{
    static boolean pairSumArray(int[] arr,int target){
	    HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++){
		    int temp=target-arr[i];
			if(set.contains(temp))return true;
			set.add(arr[i]);
		}
		return false;
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements --> ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of array --> ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("Enter target sum --> ");
		int target=sc.nextInt();
		if(pairSumArray(arr,target))System.out.println("Sum pair exist");
		else System.out.println("Sum pair not exist");
    }
}

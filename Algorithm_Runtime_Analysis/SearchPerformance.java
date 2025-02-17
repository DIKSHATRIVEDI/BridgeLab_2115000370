import java.util.*;
public class SearchPerformance{
    public static int linearSearch(int[] arr,int target){
	    for(int i=0;i<arr.length;i++){
		    if(arr[i]==target)return i;
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int target){
	    int left=0,right=arr.length-1;
		while(left<=right){
		    int mid=left+(right-left)/2;
			if(arr[mid]==target)return mid;
			else if(arr[mid]<target)left=mid+1;
			else right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args){
	    int[] sizes={1000,10000,1000000};
		Random random=new Random();
		for(int size:sizes){
		    int[] arr=new int[size];
			for(int i=0;i<size;i++){
			    arr[i]=random.nextInt(size*10);
			}
			int target=arr[size/2];
			long start=System.nanoTime();
			linearSearch(arr,target);
			long end=System.nanoTime();
			System.out.println("Linear Search for "+size+" --> "+(end-start)/1e6+" ms");
			Arrays.sort(arr);
			start=System.nanoTime();
			binarySearch(arr,target);
			end=System.nanoTime();
			System.out.println("Binary Search for "+size+" --> "+(end-start)/1e6+" ms");
			System.out.println();
		}
	}
}

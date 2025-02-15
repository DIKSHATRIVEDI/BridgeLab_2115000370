import java.util.*;
public class FindPeakElement{
    public static int findPeakElement(int[] nums){
        if(nums.length==1) return 0;
		int low=0,high=nums.length-1;
		while(low<high){
		    int mid=(low+high)/2;
			if((mid==0||nums[mid]>nums[mid-1])&&(mid==nums.length-1||nums[mid]>nums[mid+1])){
			    return mid;
			}
			if(nums[mid]>nums[mid+1])high=mid;
			else low=mid+1;
		}
	    return low;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements --> ");
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter elements of array --> ");
		for(int i=0;i<n;i++){
		    nums[i]=sc.nextInt();
		}
		int pos=findPeakElement(nums);
		System.out.println("Peak element is at index --> "+pos);
    }
}
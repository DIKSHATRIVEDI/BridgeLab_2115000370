import java.util.*;
public class FindMinimum{
    public static int findMin(int[] nums){
		int l=0,r=nums.length-1;
		while(l<r){
			int mid=l+(r-l)/2;
			if(nums[mid]>nums[r])l=mid+1;
			else if(nums[mid]<nums[r])r=mid;
			else return nums[r];
		}
		return nums[l];
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
		int minValue=findMin(nums);
		System.out.println("The minimum value is --> "+minValue);
    }
}
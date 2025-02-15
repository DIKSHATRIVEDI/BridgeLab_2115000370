import java.util.Arrays;
public class ComparisonLinearBinary{
    public static int findFirstMissingPositive(int[] nums){
	    int n=nums.length;
		for(int i=0;i<n;i++){
		    int index=Math.abs(nums[i])-1;
			if(index<n&&nums[index]>0)nums[index]=-nums[index];
		}
		for(int i=0;i<n;i++){
		    if(nums[i]>0)return i+1;
		}
		return n+1;
	}
	public static int binarySearch(int[] nums,int target){
	    int left=0;
		int right=nums.length-1;
		while(left<=right){
		    int mid=left+(right-left)/2;
			if(nums[mid]==target)return mid;
			else if(nums[mid]<target)left=mid+1;
			else right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args){
	    int[] nums={3,4,-1,1};
		System.out.println("First Missing Positive --> "+findFirstMissingPositive(nums));
		Arrays.sort(nums);
		int target=4;
		int index=binarySearch(nums,target);
		if(index!=-1)System.out.println("Index of "+target+" --> "+index);
		else System.out.println(target+" not found in array");
    }
}
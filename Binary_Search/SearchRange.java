import java.util.*;
public class SearchRange{
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=stindex(nums,target);    
        result[1]=enindex(nums,target);    
        return result;
    }
    public int stindex(int[] nums, int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int m=start+(end-start)/2;
            if(nums[m]>=target)
                end=m-1;
            else
                start=m+1;
            if(nums[m]==target)
                index=m;
        }
        return index;
    }
     public int enindex(int[] nums, int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int m=start+(end-start)/2;
            if(nums[m]<=target)
                start=m+1;
            else
                end=m-1;
                
            if(nums[m]==target)
                index=m;
        }
        return index;   
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
		System.out.print("Enter target value --> ");
		int target=sc.nextInt();
		int[] res=searchRange(nums,target);
		System.out.println("Start index --> "+res[0]+", End index --> "+res[1]);
    }
}
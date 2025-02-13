import java.util.*;
public class SlidingWindowMaximum{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements --> ");
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter elements of array --> ");
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print("Enter window size --> ");
		int k=sc.nextInt();
		SlidingWindowMaximum solution=new SlidingWindowMaximum();
		int[] result=solution.slidingWindow(nums,k);
		System.out.print("Maximums of subarrays of size k --> ");
		for(int num:result){
			System.out.print(num+" ");
		}
	}
	public int[] slidingWindow(int[] nums,int k){
		int[] res=new int[nums.length-k+1];
		Deque<Integer> dq=new ArrayDeque<>();
		for(int i=0,j=0;i<nums.length;i++){
			if(!dq.isEmpty()&&i-k+1>dq.peekFirst())dq.pollFirst();
			while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])dq.pollLast();
			dq.offer(i);
			if(i>=k-1)res[j++]=nums[dq.peekFirst()];
		}
		return res;
	}
}
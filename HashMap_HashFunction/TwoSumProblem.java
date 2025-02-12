import java.util.*;
public class TwoSumProblem{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            }
            else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
	public static void main(String[] args){
	    Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number of elements --> ");
		int n=scanner.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter elements of array --> ");
		for(int i=0;i<n;i++){
		    nums[i]=scanner.nextInt();
		}
		System.out.print("Enter the target sum --> ");
		int target=scanner.nextInt();
		TwoSumProblem ob=new TwoSumProblem();
		int[] result=ob.twoSum(nums,target);
		System.out.println("Indices are --> "+Arrays.toString(result));
    }
}
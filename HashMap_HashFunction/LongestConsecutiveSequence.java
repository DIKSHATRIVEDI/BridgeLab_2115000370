import java.util.*;
class LongestConsecutiveSequence {
    public int LongestConsecutiveSequence(int[] nums) {
        int longlen = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
           map.put(num, Boolean.FALSE);
        }
        for(int num : nums) {
            int currlen = 1;
            int nextnum = num + 1;
            while(map.containsKey(nextnum) && map.get(nextnum) == false) {
                currlen++;
                map.put(nextnum, Boolean.TRUE);
                nextnum++;
            }
            int prevnum = num - 1;
            while (map.containsKey(prevnum) && map.get(prevnum) == false) {
                currlen++;
                map.put(prevnum, Boolean.TRUE);
                prevnum--;
            }
            longlen = Math.max(longlen, currlen);
        }
        return longlen;
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
		LongestConsecutiveSequence ob=new LongestConsecutiveSequence();
		int longestSequence=ob.LongestConsecutiveSequence(nums);
		System.out.println("longest consecutive sequence is --> "+longestSequence);
    }
}

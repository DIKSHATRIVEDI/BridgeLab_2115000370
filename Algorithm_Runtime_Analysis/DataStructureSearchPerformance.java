import java.util.*;
public class DataStructureSearchPerformance{
	public static boolean linearSearch(int[] arr,int target){
		for(int value:arr){
			if(value==target)return true;
		}
		return false;
	}
	public static void main(String[] args){
		int[] sizes={1000,100000,1000000};
		Random random=new Random();
		for(int size:sizes){
			int[] arr=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=random.nextInt(size*10);
			}
			int target=arr[size/2];
			HashSet<Integer> hashSet=new HashSet<>();
			TreeSet<Integer> treeSet=new TreeSet<>();
			for(int i=0;i<size;i++){
				hashSet.add(arr[i]);
				treeSet.add(arr[i]);
			}
			long start=System.nanoTime();
			boolean foundArray=linearSearch(arr,target);
			long end=System.nanoTime();
			double arrayTime=(end-start)/1e6;
			System.out.println("Array Search for "+size+" --> "+arrayTime+" ms");
			start=System.nanoTime();
			boolean foundHashSet=hashSet.contains(target);
			end=System.nanoTime();
			double hashSetTime=(end-start)/1e6;
			System.out.println("HashSet Search for "+size+" --> "+hashSetTime+" ms");
			start=System.nanoTime();
			boolean foundTreeSet=treeSet.contains(target);
			end=System.nanoTime();
			double treeSetTime=(end-start)/1e6;
			System.out.println("TreeSet Search for "+size+" --> "+treeSetTime+" ms");
			System.out.println();
		}
	}
}

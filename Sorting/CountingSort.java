import java.util.*;
public class CountingSort{
    public static int[] countSort(int[] age){
        int n=age.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, age[i]);
        }
        int[] count=new int[max + 1];
        for (int i=0;i<n;i++){
            count[age[i]]++;
        }
        for(int i=1;i<=max;i++){
            count[i]+=count[i - 1];
        }
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[count[age[i]] - 1]=age[i];
            count[age[i]]--;
        }
        return res;
    }
	public static void display(int[] age){
	    for(int i=0;i<age.length;i++){
		    System.out.print(age[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] age=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
		    age[i]=sc.nextInt();
		}
		System.out.println("Original arr --> ");
		display(age);
		int[] res=countSort(age);
		System.out.println("\nSorted age after applying quick sort --> ");
		display(res);		
    }
}
	
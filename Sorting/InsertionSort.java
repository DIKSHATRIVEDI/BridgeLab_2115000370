import java.util.*;
public class InsertionSort{
    public void insertionFunction(int[] id){
	    int n=id.length;
		for(int i=1;i<n;i++){
		    int key=id[i];
			int j=i-1;
			while(j>=0 && id[j]>key){
			    id[j+1]=id[j];
				j--;
			}
			id[j+1]=key;
		}
	}
	public void display(int[] id){
	    for(int i=0;i<id.length;i++){
		    System.out.print(id[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
        InsertionSort insertion=new InsertionSort();
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] id=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
		    id[i]=sc.nextInt();
		}
		System.out.println("Original arr --> ");
		insertion.display(id);
		insertion.insertionFunction(id);
		System.out.println("\nSorted id after applying insertion sort --> ");
		insertion.display(id);		
    }
}
	
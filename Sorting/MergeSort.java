import java.util.*;
public class MergeSort{
     public static void mergeFunction(int[] price, int left, int mid, int right){
	    int n1=mid-left+1;
		int n2=right-mid;
		int[] leftArr=new int[n1];
		int[] rightArr=new int[n2];
		for(int i=0;i<n1;i++){
		    leftArr[i]=price[left+i];
		}
		for(int i=0;i<n2;i++){
		    rightArr[i]=price[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i<n1 && j<n2){
		    if(leftArr[i]<rightArr[j]){
			    price[k]=leftArr[i];
				i++;
			}
			else{
			    price[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<n1){
		    price[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<n2){
		    price[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public static void sort(int[] price, int left, int right){
	    if(left<right){
		    int mid=left+(right-left)/2;
			sort(price,left,mid);
			sort(price,mid+1,right);
			mergeFunction(price,left,mid,right);
		}
	}
	static void display(int[] price){
	    for(int i=0;i<price.length;i++){
		    System.out.print(price[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] price=new int[n];
		System.out.println("Enter elements of array ");
		for(int i=0;i<n;i++){
		    price[i]=sc.nextInt();
		}
		System.out.println("Original array --> ");
		display(price);
		sort(price,0,n-1);
		System.out.println("\nSorted price after applying merge sort --> ");
		display(price);		
    }
}
	
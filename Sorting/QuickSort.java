import java.util.*;
public class QuickSort{
    public static int partition(int[] price, int left, int right){
	    int pi=price[right];
		int i=left-1;
		for(int j=left;j<right;j++){
		    if(price[j]<pi){
			    i++;
			    int temp=price[i];
				price[i]=price[j];
				price[j]=temp;
			}		    
		}
		int temp=price[i+1];
		price[i+1]=price[right];
		price[right]=temp;
		return i+1;
	}
	public static void sort(int[] price, int left, int right){
	    if(left<right){
		    int pi=partition(price,left,right);
			sort(price,left,pi-1);
			sort(price,pi+1,right);
		}
	}
	public static void display(int[] price){
	    for(int i=0;i<price.length;i++){
		    System.out.print(price[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] price=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
		    price[i]=sc.nextInt();
		}
		System.out.println("Original arr --> ");
		display(price);
		sort(price,0,n-1);
		System.out.println("\nSorted price after applying quick sort --> ");
		display(price);		
    }
}
	
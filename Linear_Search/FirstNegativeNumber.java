import java.util.*;
public class FirstNegativeNumber{
    public static int firstNegative(int[] a){
	    for(int i=0;i<a.length;i++){
		    if(a[i]<0)return i;
		}
		return -1;
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("First negative no. is --> " +firstNegative(a));
	}
}
		
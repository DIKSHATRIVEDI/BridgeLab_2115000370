import java.util.*;
public class SelectionSort{
    public void selectionFunction(int[] score){
	    int n=score.length;
		for(int i=0;i<n-1;i++){
		    int min=i; 
		    for(int j=i+1;j<n;j++){
			    if(score[j]<score[min]){
				    min=j;
				}
			}
			int temp=score[i];
			score[i]=score[min];
			score[min]=temp;
		}
	}
	public void display(int[] score){
	    for(int i=0;i<score.length;i++){
		    System.out.print(score[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
        SelectionSort selection=new SelectionSort();
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] score=new int[n];
		System.out.println("Enter elements of array ");
		for(int i=0;i<n;i++){
		    score[i]=sc.nextInt();
		}
		System.out.println("Original array --> ");
		selection.display(score);
		selection.selectionFunction(score);
		System.out.println("\nSorted scoreay after applying selection sort --> ");
		selection.display(score);		
    }
}
	
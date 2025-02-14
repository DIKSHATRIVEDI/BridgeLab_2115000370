import java.util.*;
public class BubbleSort{
    public void bubbleFunction(int[] marks){
	    int n=marks.length;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
			    if(marks[j]>marks[j+1]){
				    int temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
				}
			}
		}
	}
	public void display(int[] marks){
	    for(int i=0;i<marks.length;i++){
		    System.out.print(marks[i]+ " ");
		}
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
        BubbleSort bubble=new BubbleSort();
		System.out.println("Enter size of array ");
		int n=sc.nextInt();
		int[] marks=new int[n];
		System.out.println("Enter elements of array ");
		for(int i=0;i<n;i++){
		    marks[i]=sc.nextInt();
		}
		System.out.println("Original array --> ");
		bubble.display(marks);
		bubble.bubbleFunction(marks);
		System.out.println("\nSorted marksay after applying bubble sort --> ");
		bubble.display(marks);		
    }
}
	
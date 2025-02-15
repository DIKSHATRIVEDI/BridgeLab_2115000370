import java.util.*;
public class SearchIn2DMatrix{
    private static int findRow(int[][] matrix,int target){
	    int low=0;
		int high=matrix.length-1;
		int idx=matrix[0].length-1;
		while(low<=high){
		    int mid=low+(high-low)/2;
		    if(matrix[mid][0]<=target&&matrix[mid][idx]>=target) return mid;
		    else if(matrix[mid][0]<target) low=mid+1;
		    else high=mid-1;
	    }
	    return -1;
    }
	private static boolean binarySearch(int row,int[][] matrix,int target){
	    int low=0;
		int high=matrix[row].length-1;
		while(low<=high){
		    int mid=low+(high-low)/2;
			if(matrix[row][mid]==target) return true;
			else if(matrix[row][mid]<target) low=mid+1;
			else high=mid-1;
		}
		return false;
	}
	public static boolean searchMatrix(int[][] matrix,int target){
	    int row=findRow(matrix,target);
		if(row!=-1)return binarySearch(row,matrix,target);
		return false;
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows --> ");
		int rows=sc.nextInt();
		System.out.print("Enter number of columns --> ");
		int cols=sc.nextInt();
		int[][] matrix=new int[rows][cols];
		System.out.println("Enter elements of matrix row-wise --> ");
		for(int i=0;i<rows;i++){
		    for(int j=0;j<cols;j++){
			    matrix[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter target value --> ");
		int target=sc.nextInt();
		boolean result=searchMatrix(matrix,target);
		System.out.println("Target found --> "+result);
	}
}

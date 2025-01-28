import java.util.Random;
public class MatrixManipulation{
	public static int[][] randomMatrix(int rows,int cols){
		Random rand=new Random();
		int[][] matrix=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=rand.nextInt(10);
			}
		}
		return matrix;
	}
	public static int[][] addition(int[][] matrix1,int[][] matrix2){
		int rows=matrix1.length;
		int cols=matrix1[0].length;
		int[][] result=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		return result;
	}
	public static int[][] subtraction(int[][] matrix1,int[][] matrix2){
		int rows=matrix1.length;
		int cols=matrix1[0].length;
		int[][] result=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				result[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		return result;
	}
	public static int[][] multiplication(int[][] matrix1,int[][] matrix2){
		int rows1=matrix1.length;
		int cols1=matrix1[0].length;
		int cols2=matrix2[0].length;
		int[][] result=new int[rows1][cols2];
		for(int i=0;i<rows1;i++){
			for(int j=0;j<cols2;j++){
				for(int k=0;k<cols1;k++){
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
			}
		return result;
	}
	public static int[][] transpose(int[][] matrix){
		int rows=matrix.length;
		int cols=matrix[0].length;
		int[][] transpose=new int[cols][rows];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				transpose[j][i]=matrix[i][j];
			}
		}
	    return transpose;
	}
	public static double determinant2x2(int[][] matrix){
		return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
	}
	public static double determinant3x3(int[][] matrix){
		return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])-matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])+matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
	}
	public static double[][] inverse2x2(int[][] matrix){
		double det=determinant2x2(matrix);
		if(det==0)return new double[2][2];
		double[][] inverse=new double[2][2];
		inverse[0][0]=matrix[1][1]/det;
		inverse[0][1]=-matrix[0][1]/det;
		inverse[1][0]=-matrix[1][0]/det;
		inverse[1][1]=matrix[0][0]/det;
		return inverse;
	}
    public static void displayMatrix(int[][] matrix){
		for(int[] row:matrix){
			for(int col:row){
				System.out.print(col+" ");
			}
		System.out.println();
		}
	}
    public static void displayDoubleMatrix(double[][] matrix){
		for(double[] row:matrix){
			for(double col:row){
				System.out.print(col+" ");
			}
		System.out.println();
		}
	}
    public static void main(String[] args){
		int rows1=3;int cols1=3;
		int rows2=3;int cols2=3;
		int[][] matrix1=randomMatrix(rows1,cols1);
		int[][] matrix2=randomMatrix(rows2,cols2);
		System.out.println("Matrix 1 ");
		displayMatrix(matrix1);
		System.out.println("\nMatrix 2 ");
		displayMatrix(matrix2);
		if(rows1==rows2&&cols1==cols2){
			System.out.println("\nAddition ");
			displayMatrix(addition(matrix1,matrix2));
			System.out.println("\nSubtraction ");
			displayMatrix(subtraction(matrix1,matrix2));
		}
		if(cols1==rows2){
			System.out.println("\nMultiplication ");
			displayMatrix(multiplication(matrix1,matrix2));
		}
		System.out.println("\nTranspose of Matrix 1 ");
		displayMatrix(transpose(matrix1));
		if(rows1==cols1&&rows1==2){
			double det=determinant2x2(matrix1);
			if(det!=0){
				System.out.println("\nDeterminant of Matrix 1 (2x2) "+det);
				System.out.println("\nInverse of Matrix 1 (2x2) ");
				displayDoubleMatrix(inverse2x2(matrix1));
			}
			else{
				System.out.println("\nDeterminant of Matrix 1 (2x2) is zero. Inverse does not exist.");
			}
		}
		else if(rows1==cols1&&rows1==3){
			double det=determinant3x3(matrix1);
			if(det!=0){
				System.out.println("\nDeterminant of Matrix 1 (3x3) "+det);
			}
			else{
				System.out.println("\nDeterminant of Matrix 1 (3x3) is zero. Inverse does not exist.");
			}
		}
	}
}
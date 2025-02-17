import java.util.*;
public class FibonacciPerformance{
	public static int recursive(int n){
		if(n<=1) return n;
		return recursive(n-1)+recursive(n-2);
	}
	public static int iterative(int n){
		if(n<=1) return n;
		int a=0,b=1;
		for(int i=2;i<=n;i++){
			int sum=a+b;
			a=b;
			b=sum;
		}
		return b;
	}
	public static void main(String[] args){
		int[] arr={10,30,50};
		for(int n:arr){
			System.out.println("Fibonacci for n = "+n);
			if(n<=30){
				long start=System.nanoTime();
				int recAns=recursive(n);
				long end=System.nanoTime();
				double timeRec=(end-start)/1e6;
				System.out.println("Recursive result --> "+recAns+" computed in "+timeRec+" ms");
			}
			else System.out.println("Recursive result is  Unfeasible for n = "+n+ " as it takes very much time");
			long start=System.nanoTime();
			int IterAns=iterative(n);
			long end=System.nanoTime();
			double timeIter=(end-start)/1e6;
			System.out.println("Iterative result --> "+IterAns+" computed in "+timeIter+" ms");
			System.out.println();
		}
	}
}

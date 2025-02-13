import java.util.Scanner;
import java.util.Stack;
public class StockSpanProblem{
	static void calculateSpan(int price[],int n,int arr[]){
		Stack<Integer> st=new Stack<>();
		st.push(0);
		arr[0]=1;
		for(int i=1;i<n;i++){
			while(!st.empty()&&price[st.peek()]<=price[i])
				st.pop();
			arr[i]=(st.empty())?(i+1):(i-st.peek());
			st.push(i);
		}
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number of prices --> ");
		int n=scanner.nextInt();
		int[] price=new int[n];
		System.out.println("Enter prices --> ");
		for(int i=0;i<n;i++){
			price[i]=scanner.nextInt();
		}
		int[] arr=new int[n];
		calculateSpan(price,n,arr);
		System.out.print("Span for each day --> ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
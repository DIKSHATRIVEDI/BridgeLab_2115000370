import java.util.*;
public class StringConcatPerformance{
	public static void main(String[] args){
		int[] sizes={1000,10000,1000000};
		for(int n:sizes){
			System.out.println("Concatenating "+n+" strings ");
			long start=System.nanoTime();
			String str="";
			for(int i=0;i<n;i++){
				str+="a";
			}
			long end=System.nanoTime();
			System.out.println("String concatenation time --> "+(end-start)/1e6+" ms");
			start=System.nanoTime();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<n;i++){
				sb.append("a");
			}
			end=System.nanoTime();
			System.out.println("StringBuilder concatenation time --> "+(end-start)/1e6+" ms");
			start=System.nanoTime();
			StringBuffer sbuf=new StringBuffer();
			for(int i=0;i<n;i++){
				sbuf.append("a");
			}
			end=System.nanoTime();
			System.out.println("StringBuffer concatenation time --> "+(end-start)/1e6+" ms");
			System.out.println();
		}
    }
}
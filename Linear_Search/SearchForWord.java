import java.util.*;
public class SearchForWord{
    public static String findSentence(String[] a, String word){
	    for(String s:a){
		    String[] wo=s.split(" ");
			for(String w:wo){
			    if(w.equals(word))return s;
			}	    
		}
		return "Not Found";
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No. of sentences");
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextLine();
		}
		System.out.println("Enter specific word");
		String word=sc.next();
		System.out.println("First sentence with specific word is --> " +findSentence(a, word));
	}
}
		
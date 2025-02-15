import java.util.*;
class ConcatenateString{
    public static String concatenate(String[] str){
	    StringBuffer sb=new StringBuffer();
		for(String s:str){
		    sb.append(s+" ");
		}
		return sb.toString();
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of string in array");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter elements of string in array ");
		for(int i=0;i<n;i++){
		    str[i]=sc.nextLine();
		}
		System.out.println("String after duplicates removed --> " +concatenate(str));
	}
}
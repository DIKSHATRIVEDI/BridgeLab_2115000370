import java.util.*;
class ReverseString{
    public static String reverse(String str){
	    StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString();
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Reversed string --> " +reverse(str));
	}
}
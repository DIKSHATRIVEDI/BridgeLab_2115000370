import java.util.Scanner;
public class Palindrome{
    public static String input(){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string ");
		return sc.nextLine();
	}
	public static boolean check(String str){
	    String reverseStr="";
		for(int i=str.length()-1;i>=0;i--)reverseStr+=str.charAt(i);
		return str.equalsIgnoreCase(reverseStr);
	}
	public static void display(String str,boolean palindrome){
	    if(palindrome)System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}
    public static void main(String[] args){
        String str=input();
		boolean palindrome=check(str);
		display(str,palindrome);
	}
}
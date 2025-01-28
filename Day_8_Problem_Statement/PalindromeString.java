import java.util.Scanner;
public class PalindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string ");
        String str=sc.nextLine();
		if(isPalindrome(str))System.out.println(str+" is palindrome");
		else System.out.println(str+" is not palindrome");
	}
	public static boolean isPalindrome(String str){
	    String reverseStr="";
		for(int i=str.length()-1;i>=0;i--)reverseStr+=str.charAt(i);
		return str.equalsIgnoreCase(reverseStr);
    }
}
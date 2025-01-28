import java.util.*;
public class Anagram{
    public static boolean checkAnagram(String str1,String str2){
	    str1=str1.toLowerCase().replaceAll("\\s","");
		str2=str2.toLowerCase().replaceAll("\\s","");
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter first string ");
	    String str1=sc.nextLine();
	    System.out.print("Enter second string ");
	    String str2=sc.nextLine();
	    if(checkAnagram(str1,str2))System.out.println("Anagrams");
	    else System.out.println("Not Anagrams");
	}
}
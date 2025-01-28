import java.util.Scanner;
public class ToggleCaseOfCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string ");
		String str=sc.nextLine();
		String toggledStr="";
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
			if(Character.isUpperCase(ch))toggledStr+=Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch))toggledStr+=Character.toUpperCase(ch);
			else toggledStr+=ch;
		}
	    System.out.println("Original String "+str);
		System.out.println("Toggled String "+toggledStr);
	}
}
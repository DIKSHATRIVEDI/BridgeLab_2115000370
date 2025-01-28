import java.util.Scanner;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter string ");
		String str=sc.nextLine();
		String answer="";
		for(int i=0;i<str.length();i++){
		    if(!answer.contains(String.valueOf(str.charAt(i))))answer+=str.charAt(i);
		}
		System.out.println("Original String "+str);
		System.out.println("String without duplicates "+answer);
	}
}
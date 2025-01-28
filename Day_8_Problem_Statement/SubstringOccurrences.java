import java.util.Scanner;
public class SubstringOccurrences{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter string ");
		String str=sc.nextLine();
		System.out.print("Enter substring ");
		String subStr=sc.nextLine();
		int count=countOfOccurrence(str,subStr);
		System.out.println("Number of occurrences --> "+count);
	}
	public static int countOfOccurrence(String str,String subStr){
	    int count=0;
		int position=0;
		while((position=str.indexOf(subStr,position))!=-1){
		    count++;
			position+=subStr.length();
		}
		return count;
	}
}
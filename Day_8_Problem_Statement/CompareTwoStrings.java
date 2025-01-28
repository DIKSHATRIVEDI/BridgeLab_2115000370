import java.util.Scanner;
public class CompareTwoStrings{
    public static int compareStrings(String str1,String str2){
	    int len1=str1.length();
		int len2=str2.length();
		int minLen=Math.min(len1,len2);
		for(int i=0;i<minLen;i++){
		    if(str1.charAt(i)<str2.charAt(i))return -1;
			else if(str1.charAt(i)>str2.charAt(i))return 1;
		}
		if(len1<len2)return -1;
		else if(len1>len2)return 1;
		else return 0;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string ");
		String str1=sc.nextLine();
		System.out.print("Enter second string ");
		String str2=sc.nextLine();
		if(compareStrings(str1,str2)<0)System.out.println(str1+" comes before "+str2+" in lexicographical order");
		else if(compareStrings(str1,str2)>0)System.out.println(str2+" comes before "+str1+" in lexicographical order");
		else System.out.println("Strings are equal");
	}
}
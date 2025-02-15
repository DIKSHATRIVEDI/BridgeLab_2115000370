import java.util.*;
class RemoveDuplicate{
    public static String reverse(String str){
	    StringBuilder sb=new StringBuilder();
		Set<Character> set=new HashSet<>();
		for(Character ch:str.toCharArray()){
		    set.add(ch);
		}
		for(Character ch:set){
		    sb.append(ch);
		}
		return sb.toString();
	}
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("String after duplicates removed --> " +reverse(str));
	}
}
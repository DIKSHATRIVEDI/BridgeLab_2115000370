public class ReverseString{
    public static void main(String[] args){
        String str="hello";
		String reverseStr="";
		for(int i=str.length()-1;i>=0;i--)reverseStr+=str.charAt(i);
		System.out.println("Original String -->"+str);
		System.out.println("Reversed String -->"+reverseStr);
    }
}
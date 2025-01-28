public class RemoveCharacterFromString{
    public static void main(String[] args){
	    String str="Hello World";
		char charToRemove='l';
		String newStr="";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)!=charToRemove)newStr+=str.charAt(i);
		}
		System.out.println("Original String -->"+str);
		System.out.println("Modified String -->"+newStr);
	}
}
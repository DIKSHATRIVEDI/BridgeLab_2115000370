public class ReplaceWord{
    public static String replaceWord(String sentence,String oldWord,String newWord){
        return sentence.replace(oldWord,newWord);
    }
    public static void main(String[] args){
        String sentence="This is a sample sentence";
		String oldWord="sample";
		String newWord="test";
		String newSentence=replaceWord(sentence,oldWord,newWord);
		System.out.println("Original sentence -->"+sentence);
		System.out.println("New sentence -->"+newSentence);
	}
}
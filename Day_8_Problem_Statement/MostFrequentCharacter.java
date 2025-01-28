public class MostFrequentCharacter{
    public static char findMostFrequen(String str){
	    int[] array=new int[256]; 
		for(char ch:str.toCharArray())array[ch]++;
		int maxCount=0;
		char mostFrequentChar=' ';
		for(int i=0;i<256;i++){
		    if(array[i]>maxCount){
			    maxCount=array[i];
				mostFrequentChar=(char)i;
			}
		}
	    return mostFrequentChar;
	}
    public static void main(String[] args){
        String str="success";
		char mostFrequentChar=findMostFrequen(str);
		System.out.println("Most Frequent Character "+mostFrequentChar);
	}
}
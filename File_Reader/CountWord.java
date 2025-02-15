import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountWord{
    public static void main(String[] args){
	    String file="Life.txt";
		String target="the";
		int count=0;
		try(FileReader fr=new FileReader(file);
		    BufferedReader br=new BufferedReader(fr)){
			String str;
			while((str=br.readLine())!=null){
			    String[] words=str.split("\\s+");
			    for(String word:words){
			        if(word.equalsIgnoreCase(target))count++;
			    }
            }
		}
		catch(IOException e){
		    System.err.println("Error --> "+e.getMessage());
		}
		System.out.println("Count of target is --> "+count);
	}
}
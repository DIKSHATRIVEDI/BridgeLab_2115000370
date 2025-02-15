import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TextLineByLine{
    public static void main(String[] args){
	    String file="Life.txt";
        try(FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr)) {
            String str;
            while((str=br.readLine()) != null){
                System.out.println(str);
            }
        } 
		catch(IOException e){
            System.err.println("error --> " +e.getMessage());
        }
	}
}
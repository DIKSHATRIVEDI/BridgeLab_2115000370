import java.io.*;
public class ByteToCharacter{
    public static void main(String[] args){
	    String file="Life.txt";
		String charsetName="UTF-8";
		try(FileInputStream fis=new FileInputStream(file);
		    InputStreamReader isr=new InputStreamReader(fis,charsetName);
			BufferedReader br=new BufferedReader(isr)){
			String line;
			while((line=br.readLine())!=null){
			    System.out.println(line);
			}
		}
		catch(IOException e){
		    System.err.println("Error --> "+e.getMessage());
		}
	}
}
import java.io.*;
import java.nio.charset.StandardCharsets;
public class FileReadPerformance{
	public static void main(String[] args){
		String path="Life.txt";
		long frTime=measureFileReader(path);
		System.out.println("FileReader Time --> "+frTime+" ms");
		long isrTime=measureInputStreamReader(path);
		System.out.println("InputStreamReader Time --> "+isrTime+" ms");
		System.out.println("\nComparison --> ");
		System.out.println("FileReader Time --> "+frTime+" ms");
		System.out.println("InputStreamReader Time --> "+isrTime+" ms");
		if(isrTime<frTime)System.out.println("\nInputStreamReader is faster");
		else System.out.println("\nFileReader is faster");
	}
	private static long measureFileReader(String path){
		long start=System.currentTimeMillis();
		try(FileReader fr=new FileReader(path)){
			while(fr.read()!=-1){}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return System.currentTimeMillis()-start;
	}
	private static long measureInputStreamReader(String path){
		long start=System.currentTimeMillis();
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream(path),StandardCharsets.UTF_8)){
			while(isr.read()!=-1){}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return System.currentTimeMillis()-start;
	}
}
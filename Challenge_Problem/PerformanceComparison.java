import java.io.*;
import java.util.Date;
public class PerformanceComparison{
    public static void main(String[] args){
        String str="hello";
		long start,end;
		start=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<1000000;i++){
		    sb.append(str);
		}
		end=System.currentTimeMillis();
		System.out.println("StringBuilder time --> "+(end-start)+" ms");
		start=System.currentTimeMillis();
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<1000000;i++){
		    sbf.append(str);
		}
		end=System.currentTimeMillis();
		System.out.println("StringBuffer time --> "+(end-start)+" ms");
		String path="Life.txt";
		start=System.currentTimeMillis();
		try(FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr)){
			String line;
			int count=0;
			while((line=br.readLine())!=null){
			    String[] words=line.split("\\s+");
				count+=words.length;
			}
			System.out.println("FileReader word count --> "+count);
		}
		catch(IOException e){
		    System.err.println("Error "+e.getMessage());
		}
		end=System.currentTimeMillis();
		System.out.println("FileReader time --> "+(end-start)+" ms");
		start=System.currentTimeMillis();
		try(FileInputStream fis=new FileInputStream(path);
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr)){
		    String line;
			int count=0;
			while((line=br.readLine())!=null){
			    String[] words=line.split("\\s+");
				count+=words.length;
			}
			System.out.println("InputStreamReader word count --> "+count);
		}
		catch(IOException e){
		    System.err.println("Error "+e.getMessage());
		}
		end=System.currentTimeMillis();
		System.out.println("InputStreamReader time --> "+(end-start)+" ms");
	}
}
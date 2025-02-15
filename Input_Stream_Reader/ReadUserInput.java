import java.io.*;
public class ReadUserInput{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		FileWriter file=new FileWriter("Line.txt");
		BufferedWriter bw=new BufferedWriter(file);
		String str;
		System.out.println("Enter str lines, Type 'exit' to stop");
		    while(!(str=br.readLine()).equals("exit")){
			bw.write(str);
			bw.newLine();
		}
		System.out.println("Input is written to Life.txt");
	}
}
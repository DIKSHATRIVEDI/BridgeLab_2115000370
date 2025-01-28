import java.util.Scanner;
public class CountVowelConsonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string ");
		String str=sc.nextLine();
		int vowelCount=0;
		int consonantCount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'){
			    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vowelCount++;
				else consonantCount++;
			}
		}
		System.out.println("Number of vowels "+vowelCount);
		System.out.println("Number of consonants "+consonantCount);
	}
}
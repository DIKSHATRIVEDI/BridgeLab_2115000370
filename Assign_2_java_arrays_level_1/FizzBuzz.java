import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer ");
		int n=sc.nextInt();
		String[] answer=new String[n];
		if(n>0){
		    for(int i=0;i<n;i++)answer[i]=Integer.toString(i+1); 
			for(int i=0;i<n;i++){
		        if((i+1)%3==0 && (i+1)%5==0)answer[i]="FizzBuzz";
			    else if((i+1)%3==0)answer[i]="Fizz";
		        else if((i+1)%5==0)answer[i]="Buzz";
		    }
			for(int i=0;i<n;i++)System.out.println("Position "+(i+1)+" = "+answer[i]);
		}
		else System.out.println("Enter a positive integer");
	}
}
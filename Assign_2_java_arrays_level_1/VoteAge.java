import java.util.Scanner;
public class VoteAge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		int[] ages=new int[10];
		for(int i=0;i<10;i++){
		    System.out.print("Enter age of student "+(i+1)+" ");
			ages[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
		    if(ages[i]<0)System.out.println("Invalid age");
		    else if(ages[i]>=18)System.out.println("Student with age "+ages[i]+" can vote");
		    else System.out.println("Student with age "+ages[i]+" cannot vote");
        }
	}
}
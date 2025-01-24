import java.util.Scanner;
public class AmarAkbarAnthonyYoungestTallest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
	int[] age={0,0,0};
	int[] height={0,0,0};
	String[] names={"Amar","Akbar","Anthony"};
	System.out.print("Enter age of Amar ");
	age[0]=sc.nextInt();
	System.out.print("Enter age of Akbar ");
	age[1]=sc.nextInt();
	System.out.print("Enter age of Anthony ");
	age[2]=sc.nextInt();
	System.out.print("Enter height of Amar ");
        height[0]=sc.nextInt();
	System.out.print("Enter height of Akbar ");
	height[1]=sc.nextInt();
	System.out.print("Enter height of Anthony ");
	height[2]=sc.nextInt();
	int youngest=age[0];
	int posYoungest=0;
	int tallest=height[0];
	int posTallest=0;
	for(int i=1;i<3;i++){
	    if(age[i]<youngest){
	        youngest=age[i];
	        posYoungest=i;
	    }
            if(height[i]>tallest){
		tallest=height[i];
		posTallest=i;
	    }
	}
	System.out.println("Youngest friend -> "+names[posYoungest]);
	System.out.println("Tallest friend -> "+names[posTallest]);
    }
}

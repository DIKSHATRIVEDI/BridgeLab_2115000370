import java.util.Scanner;
public class FactorsOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int maxFactor=10; 
		int[] factorArray=new int[maxFactor];
		int index=0;
		for(int i=1;i<=number/2;i++){
		    if(number%i==0){
			    if(index==maxFactor){ 
				    int[] arr=new int[maxFactor*2]; 
					for(int j=0;j<maxFactor;j++)arr[j]=factorArray[j]; 
					factorArray=arr; 
					maxFactor*=2; 
				}
				factorArray[index++]=i;
			}
		}
		System.out.print("Factors of "+number+" ");
		for(int i=0;i<index;i++)System.out.print(factorArray[i]+" ");
    }
}
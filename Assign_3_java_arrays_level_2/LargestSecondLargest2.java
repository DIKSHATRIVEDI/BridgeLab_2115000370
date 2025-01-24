import java.util.Scanner;
public class LargestSecondLargest2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int number=sc.nextInt();
		int copy=number;
		int maxDigit=10;
		int[] digits=new int[maxDigit];
		int index=0;
		while(copy!=0){
		    if(index==maxDigit){
			    int[] flag=new int[maxDigit+10];
				for(int i=0;i<maxDigit;i++)flag[i]=digits[i];
				digits=flag;
				maxDigit+=10;
			}
			digits[index]=copy%10;
			copy=copy/10;
			index++;
		}
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<index;i++){
		    if(digits[i]>largest){
			    secondLargest=largest;
				largest=digits[i];
			}
			else if(digits[i]>secondLargest && digits[i]!=largest)
			    secondLargest=digits[i];
		}
		System.out.println("Largest digit "+largest);
		System.out.println("Second largest digit "+secondLargest);
    }
}
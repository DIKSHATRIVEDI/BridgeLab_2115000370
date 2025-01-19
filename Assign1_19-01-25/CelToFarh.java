import java.util.*;
public class CelToFarh{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in celcius");
	    int c=sc.nextInt();
		int f=(c*9/5)+32;
       	System.out.println("Temperature in Fahrenheit =" +f);
	}
}

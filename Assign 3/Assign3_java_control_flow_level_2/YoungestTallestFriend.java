import java.util.Scanner;
public class YoungestTallestFriend{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of Amar ");
        int amarAge=sc.nextInt();
        System.out.print("Enter age of Akbar ");
        int akbarAge=sc.nextInt();
        System.out.print("Enter age of Anthony ");
        int anthonyAge=sc.nextInt();
        System.out.print("Enter height of Amar ");
        int amarHeight=sc.nextInt();
        System.out.print("Enter height of Akbar ");
        int akbarHeight=sc.nextInt();
        System.out.print("Enter height of Anthony ");
        int anthonyHeight=sc.nextInt();
        int youngestAge=Math.min(Math.min(amarAge,akbarAge),anthonyAge);
        int tallestHeight=Math.max(Math.max(amarHeight,akbarHeight),anthonyHeight);
        if(youngestAge==amarAge)System.out.println("Youngest friend is Amar");
        else if(youngestAge==akbarAge)System.out.println("Youngest friend is Akbar");
        else System.out.println("Youngest friend is Anthony");
	if(tallestHeight==amarHeight)System.out.println("Tallest friend is Amar");
	else if(tallestHeight==akbarHeight)System.out.println("Tallest friend is Akbar");
	else System.out.println("Tallest friend is Anthony");
    }
}

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
	public static int generateGuess(){
		Random rand=new Random();
		return rand.nextInt(100)+1;
	}
	public static int generateHigherGuess(int guess){
		Random rand=new Random();
		return guess+rand.nextInt(50)+1;
	}
	public static int generateLowerGuess(int guess){
		Random rand=new Random();
		return Math.max(1,guess-rand.nextInt(50)-1);
	}
	public static char getFeedback(Scanner sc){
		System.out.println("Is my guess 'h'igher, 'l'ower, or 'c'orrect?");
		char feedback=Character.toLowerCase(sc.next().charAt(0));
		while(feedback!='h'&&feedback!='l'&&feedback!='c'){
			System.out.println("Invalid input");
			feedback=Character.toLowerCase(sc.next().charAt(0));
		}
		return feedback;
	}
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Think of number between 1 and 100.");
		int number;
		do{
			System.out.print("Enter your number ");
			number=sc.nextInt();
			if(number<1||number>100)System.out.println("Invalid input");
		}
		while(number<1||number>100);
		int guessCount=0;
		int guess=generateGuess();
		while(true){
			guessCount++;
			System.out.println("Computer's guess "+guess);
			char feedback=getFeedback(sc);
			if(feedback=='h')guess=generateLowerGuess(guess);
			else if(feedback=='l')guess=generateHigherGuess(guess);
			else if(feedback=='c'){
				System.out.println("Computer guessed the number in "+guessCount+" attempts");
				break;
			}
		}
	}
}
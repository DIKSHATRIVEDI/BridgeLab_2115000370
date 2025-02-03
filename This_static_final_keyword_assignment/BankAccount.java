import java.util.Scanner;
public class BankAccount{
    static String bankName="HDFC Bank";
	static int totalAccounts=0;
	final int accountNumber;
	String accountHolderName;
	double balance;
	public BankAccount(String accountHolderName,double initialBalance){
	    this.accountHolderName=accountHolderName;
	    this.balance=initialBalance;
		accountNumber=++totalAccounts;
	}
    public static int getTotalAccounts(){
	    return totalAccounts;
	}
	public void display(){
	    if(this instanceof BankAccount){
		    System.out.println("Bank Name --> "+bankName);
			System.out.println("Account Number --> "+accountNumber);
			System.out.println("Account Holder --> "+accountHolderName);
			System.out.println("Current Balance --> $"+balance);
		}
		else System.out.println("Not a valid object");
	}
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Holder Name ");
		String accountHolderName=sc.nextLine();
		System.out.print("Enter Initial Balance ");
		double initialBalance=sc.nextDouble();
		BankAccount account=new BankAccount(accountHolderName,initialBalance);
		account.display();
		System.out.println("Total Accounts --> "+BankAccount.getTotalAccounts());
    }
}
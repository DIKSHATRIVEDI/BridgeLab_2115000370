import java.util.Scanner;
class BankAccount{
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	public BankAccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		if(amount<=balance)balance-=amount;
		else System.out.println("Insufficient funds");
	}
}
class SavingsAccount extends BankAccount{
	public SavingsAccount(int accountNumber,String accountHolder,double balance){
		super(accountNumber,accountHolder,balance);
	}
	public void displayAccountInfo(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Current Balance: $"+getBalance());
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Number ");
		int accountNumber=sc.nextInt();
		System.out.print("Enter Account Holder Name ");
		sc.nextLine(); 
		String accountHolder=sc.nextLine();
		System.out.print("Enter Initial Balance ");
		double balance=sc.nextDouble();
		SavingsAccount savingsAccount=new SavingsAccount(accountNumber,accountHolder,balance);
		savingsAccount.displayAccountInfo();
		System.out.print("Enter amount to deposit ");
		double depositAmount=sc.nextDouble();
		savingsAccount.deposit(depositAmount);
		System.out.println("Balance after deposit $"+savingsAccount.getBalance());
		System.out.print("Enter amount to withdraw ");
		double newAmount=sc.nextDouble();
		savingsAccount.withdraw(newAmount);
		System.out.println("Balance after withdrawal $"+savingsAccount.getBalance());
	}
}

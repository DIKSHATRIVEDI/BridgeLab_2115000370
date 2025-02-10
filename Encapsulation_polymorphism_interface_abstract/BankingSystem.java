import java.util.ArrayList;
import java.util.List;
    interface Loanable{
    void applyForLoan();
        boolean calculateLoanEligibility();
    }
abstract class BankAccount{
    private String accountNumber;
	private String holderName;
	private double balance;
	public BankAccount(String accountNumber,String holderName,double balance){
	    this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	public String getAccountNumber(){
	    return accountNumber;
	}
	public String getHolderName(){
	    return holderName;
	}
	public double getBalance(){
	    return balance;
	}
	public void deposit(double amount){
	    balance+=amount;
	    System.out.println("Deposited --> $"+amount);
	}
	public void withdraw(double amount){
		if(amount<=balance){
			balance-=amount;
			System.out.println("Withdrawn --> $"+amount);
		}
		else System.out.println("Insufficient funds");
    }
	public abstract double calculateInterest();
	    public void displayAccountInfo(){
			System.out.println("Account Number --> "+accountNumber);
			System.out.println("Holder Name --> "+holderName);
			System.out.println("Balance --> $"+balance);
		}
	}
class SavingsAccount extends BankAccount implements Loanable{
	private double interestRate;
	public SavingsAccount(String accountNumber,String holderName,double balance,double interestRate){
		super(accountNumber,holderName,balance);
		this.interestRate=interestRate;
	}
	@Override
	public double calculateInterest(){
		return getBalance()*interestRate;
	}
	@Override
	public void applyForLoan(){
		System.out.println(getHolderName()+" applied for a loan");
	}
	@Override
	public boolean calculateLoanEligibility(){
		return getBalance()>1000;
	}
}
class CurrentAccount extends BankAccount{
	private double overdraftLimit;
	public CurrentAccount(String accountNumber,String holderName,double balance,double overdraftLimit){
		super(accountNumber,holderName,balance);
		this.overdraftLimit=overdraftLimit;
	}
	@Override
	public double calculateInterest(){
		return 0;
	}
	@Override
	public void withdraw(double amount){
		double availableBalance=getBalance()+overdraftLimit;
		if(amount<=availableBalance)super.withdraw(amount);
		else System.out.println("Exceeds overdraft limit");
    }
}
public class BankingSystem{
	public static void main(String[] args){
		List<BankAccount> accounts=new ArrayList<>();
		accounts.add(new SavingsAccount("SA-1","Riya",5010,0.09));
		accounts.add(new CurrentAccount("CA-1","Siya",1050,2500));
		for(BankAccount account:accounts){
			account.displayAccountInfo();
			System.out.println("Interest --> $"+account.calculateInterest());
			if(account instanceof Loanable){
				Loanable loanableAccount=(Loanable)account;
				loanableAccount.applyForLoan();
				System.out.println("Loan Eligible --> "+loanableAccount.calculateLoanEligibility());
			}
			System.out.println();
		}
	}
}
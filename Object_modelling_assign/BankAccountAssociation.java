class Bank{
    private String name;
	private String location;
	public Bank(String name,String location){
		this.name=name;
		this.location=location;
	}
	public String getName(){
		return name;
	}
	public String getLocation(){
		return location;
	}
	public void openAccount(Customer customer){
		Account account=new Account();
		customer.setAccount(account);
		System.out.println("Account opened for "+customer.getName()+" at "+this.name);
	}
}
class Customer{
	private String name;
	private String address;
	private Account account;
	public Customer(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public void setAccount(Account account){
		this.account=account;
	}
	public Account getAccount(){
		return account;
	}
	public void viewBalance(){
		if(account!=null)System.out.println("Current balance for "+this.name+" --> "+account.getBalance());
		else System.out.println("No account associated with --> "+this.name);
    }
}
class Account{
	private double balance;
	public Account(){
		this.balance=0.0;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		if(balance>=amount)balance-=amount;
		else System.out.println("Insufficient funds");
    }
}
public class BankAccountAssociation{
	public static void main(String[] args){
		Bank bank=new Bank("HDFC Bank","City Lucknow");
		Customer customer1=new Customer("John Doe","Address 1");
		Customer customer2=new Customer("Jane Smith","Address 2");
		bank.openAccount(customer1);
		customer1.getAccount().deposit(1000.0);
		customer1.viewBalance();
		customer2.viewBalance();
	}
}
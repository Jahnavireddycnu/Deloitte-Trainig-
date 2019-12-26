package account;

public class SavingsAccount extends acct {
	private static final double MINIMUM = 10000;
	
	public SavingsAccount(String name, int number, double balance) {
		super(name, number, balance);
		// TODO Auto-generated constructor stub
		System.out.println("saving account constructor called");
		}
	@Override
	public void print(String s) {
		super.print(s);
	}
	

	@Override
	public void withdraw(double amount) {
	if((balance-amount)>=MINIMUM)
	{
		balance=(balance-amount);
		System.out.println("balance ="+balance);
	}
	else
	{
		System.out.println("insufficient balance try again");
	}
}
	public void deposit(double amount) {
		balance=+amount;
		System.out.println("balance = "+balance);
	}
	}
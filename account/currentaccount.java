package account;

public class currentaccount extends acct {
	private static final double MINIMUM = 0;
	public currentaccount(String name, int number, double balance) {
		super(name, number, balance);
		// TODO Auto-generated constructor stub
		System.out.println("current account called");
		}
	@Override
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("balance ="+balance);
		}
		else
		{
			System.out.println("there is no balance");
		}
	}
	
}

package account;

public abstract class acct implements printer {
	protected String name;
	protected int number;
	protected double balance;
	
	
	

	public acct(String name, int number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
		
		
	}
	public abstract void withdraw(double amount);



	@Override
	public String toString() {
		return "acct [name=" + name + ", number=" + number + ", balance=" + balance + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void withdraow(double amount) {
		// TODO Auto-generated method stub
		
	}

	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println("printing account info " +s);
	}

}

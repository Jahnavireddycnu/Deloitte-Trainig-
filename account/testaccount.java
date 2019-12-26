package account;

public class testaccount {
	
	public static void Showbalance(acct ac) {
		System.out.println(ac.getBalance());
	}
	public static void printAccount(acct ac, printer p) {
		ac.print("from accounts");
		ac.print("from printer class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("Jahnavi", 123, 20000);
		System.out.println(sa);
		sa.withdraw(9000);
		System.out.println(sa);
		currentaccount ca = new currentaccount("Reddy", 2345, 4000);
		System.out.println(ca);
		ca.withdraw(6000);
		System.out.println(ca);
		//polymorphism
		acct ac = new SavingsAccount("Amit", 2134, 30000);
		System.out.println(ac);
		ac.withdraw(4000);
		System.out.println(ac);
		Showbalance(ac);
		Showbalance(sa);
		Showbalance(ca);
		ac.print("hello account");
		sa.print("savings account");
		printAccount(ac, new consoleprinter());
		printAccount(ac, new fileprinter());
		
		
		
	}

}

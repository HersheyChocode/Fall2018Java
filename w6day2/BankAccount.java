package w6day2;

public class BankAccount {
	private int pin;
	private double balance;
	public static double overdrawPenalty = 20.0;
	
	public BankAccount(int password, double balance) {
		this.pin = password;
		this.balance = balance;
	}
	
	public double getBalance(int enteredPin) {
		if (enteredPin==pin) {
			return balance;
		} else {			
			System.out.println("UserError \n" + -1.0);
			return -1.0;
		}
	}
	
	public void deposit(int password, double amount) {
		if(password == pin) {
			balance = balance + amount;
		} else {
			System.out.println("User Error");
		}
	}
	/*public void deposit(double amount) {
		System.out.println("Amount, 2nd");
	}
	public void deposit(int myName, int amount) {
	}
	public void deposit(int helo, int hi) {
	}*/
	
	public void withdraw(int password, double amount){
		if(password == pin) {
			if (amount>balance) {
				balance = balance - amount - overdrawPenalty;
			}else {
				balance = balance - amount;
			}
		}
	}

	public static double interestRate(){
	double x = 10;
	return x;
}

}